package com.syl.util;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.syl.daomain.MorseCode;

/**
 * toolName 英文转换成摩斯密码：规则：1.字母之间插入" " 2.","或者"."转换成"/"
 * 
 * @author arya
 *
 */
public class EnligshToMorseCodeUtil {

	public static String toMorseCode(String str) {
		StringBuilder sb = new StringBuilder("");// 最终转换完成的字符串

		// 1 将所有摩斯密码放入map
		Map<String, Object> codeMap = new HashMap<String, Object>();
		MorseCode code = new MorseCode();
		try {
			codeMap = JavaBeanUtil.convertBeanToMap(code);
		} catch (IllegalAccessException | InvocationTargetException | IntrospectionException e) {
			e.printStackTrace();
		}
		Set<String> set = codeMap.keySet();// 获取摩斯密码能转换的字符

		// 2 处理需要转换的字符串
		String lowerStr = str.toLowerCase();
		int len = lowerStr.length();
		for (int i = 0; i < len; i++) {
			str.replaceAll("  ", " ");
		}
		len = lowerStr.length();

		// 3.开始转换
		for (int i = 0; i < len; i++) {
			if (String.valueOf(lowerStr.charAt(i)).equals(",")) {
				sb.append("/");
			} else if (String.valueOf(lowerStr.charAt(i)).equals(".")) {
				sb.append("/");
			} else if (set.contains(String.valueOf(lowerStr.charAt(i)))) {
				sb.append(codeMap.get(String.valueOf(lowerStr.charAt(i))));
				sb.append(" ");
			} /*
				 * else { System.out.println("有不可转换的字符：" + String.valueOf(lowerStr.charAt(i)));
				 * }
				 */
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("-- 英文转换至摩斯密码 --");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要转换的内容，以回车结束：");
		String str = scanner.nextLine();

		String str2 = EnligshToMorseCodeUtil.toMorseCode(str);
		String str3 = ChangeLineUtil.changeLine(str2);
		System.out.println("转换后为：\r\n" + str3);
		scanner.close();
	}
}
