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
 * toolName 摩斯密码转换成英文：规则："/"转换成","
 * 
 * @author arya
 *
 */
public class MorseCodeToEnligshUtil {

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
		Set<Entry<String, Object>> set = codeMap.entrySet();// 获取摩斯密码能转换的字符

		// 2 处理需要转换的字符串，得到需要转换的字符串数组
		String lowerStr = str.toLowerCase().replaceAll("/", " , ");
		int len = lowerStr.length();
		for (int i = 0; i < len; i++) {
			lowerStr.replaceAll("  ", " ");
		}
		String[] strArr = lowerStr.split(" ");

		// 3.开始转换
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
		System.out.println("-- 摩斯密码转换至英文 --");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要转换的内容，以回车结束：");
		String str = scanner.nextLine();
		String str2 = MorseCodeToEnligshUtil.toMorseCode(str);
		String str3 = ChangeLineUtil.changeLine(str2);
		System.out.println("转换后为：\r\n" + str3);
		scanner.close();
	}
}
