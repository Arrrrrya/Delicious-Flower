package com.syl.util;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.syl.daomain.MorseCode;

/**
 * toolName Ħ˹����ת����Ӣ�ģ�����"/"ת����","
 * 
 * @author arya
 *
 */
public class MorseCodeToEnligshUtil {

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
		Set<Entry<String, Object>> set = codeMap.entrySet();// ��ȡĦ˹������ת�����ַ�

		// 2 ������Ҫת�����ַ������õ���Ҫת�����ַ�������
		String lowerStr = str.toLowerCase().replaceAll("/", " , ");
		int len = lowerStr.length();
		for (int i = 0; i < len; i++) {
			lowerStr.replaceAll("  ", " ");
		}
		String[] strArr = lowerStr.split(" ");

		// 3.��ʼת��
		for (String string : strArr) {
			for (Entry<String, Object> entry : set) {
				if (string.equals(entry.getValue().toString())) {
					sb.append(entry.getKey());
					break;
				}
				if (string.equals(",")) {
					sb.append(string);
					break;
				}
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("-- Ħ˹����ת����Ӣ�� --");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫת�������ݣ��Իس�������");
		String str = scanner.nextLine();
		String str2 = MorseCodeToEnligshUtil.toMorseCode(str);
		String str3 = ChangeLineUtil.changeLine(str2);
		System.out.println("ת����Ϊ��\r\n" + str3);
		scanner.close();
	}
}
