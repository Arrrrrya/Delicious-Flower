package com.syl.util;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.syl.daomain.MorseCode;

/**
 * toolName Ӣ��ת����Ħ˹���룺����1.��ĸ֮�����" " 2.","����"."ת����"/"
 * 
 * @author arya
 *
 */
public class EnligshToMorseCodeUtil {

	public static String toMorseCode(String str) {
		StringBuilder sb = new StringBuilder("");// ����ת����ɵ��ַ���

		// 1 ������Ħ˹�������map
		Map<String, Object> codeMap = new HashMap<String, Object>();
		MorseCode code = new MorseCode();
		try {
			codeMap = JavaBeanUtil.convertBeanToMap(code);
		} catch (IllegalAccessException | InvocationTargetException | IntrospectionException e) {
			e.printStackTrace();
		}
		Set<String> set = codeMap.keySet();// ��ȡĦ˹������ת�����ַ�

		// 2 ������Ҫת�����ַ���
		String lowerStr = str.toLowerCase();
		int len = lowerStr.length();
		for (int i = 0; i < len; i++) {
			str.replaceAll("  ", " ");
		}
		len = lowerStr.length();

		// 3.��ʼת��
		for (int i = 0; i < len; i++) {
			if (String.valueOf(lowerStr.charAt(i)).equals(",")) {
				sb.append("/");
			} else if (String.valueOf(lowerStr.charAt(i)).equals(".")) {
				sb.append("/");
			} else if (set.contains(String.valueOf(lowerStr.charAt(i)))) {
				sb.append(codeMap.get(String.valueOf(lowerStr.charAt(i))));
				sb.append(" ");
			} /*
				 * else { System.out.println("�в���ת�����ַ���" + String.valueOf(lowerStr.charAt(i)));
				 * }
				 */
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("-- Ӣ��ת����Ħ˹���� --");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫת�������ݣ��Իس�������");
		String str = scanner.nextLine();

		String str2 = EnligshToMorseCodeUtil.toMorseCode(str);
		String str3 = ChangeLineUtil.changeLine(str2);
		System.out.println("ת����Ϊ��\r\n" + str3);
		scanner.close();
	}
}
