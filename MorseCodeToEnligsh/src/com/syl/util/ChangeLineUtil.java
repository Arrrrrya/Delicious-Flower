package com.syl.util;

/**
 * toolName 字符串换行工具 1.str为需要进行换行的字符串，必须，类型为String 2.len为每隔多少长度进行换行，非必须，类型为int，默认为50
 * 
 * @author arya
 *
 */
public class ChangeLineUtil {
	public static String changeLine(String str, int len) {
		StringBuilder sb = new StringBuilder(str);
		int n = sb.length() / len;
		if (n > 0) {
			// 因为插入换行符会使字符串长度增加，因此必须从字符串后面开始换行
			for (int i = n; i > 0; i--) {
				sb.insert(i * len, "\r\n");
			}
		}
		return sb.toString();
	}

	public static String changeLine(String str) {
		StringBuilder sb = new StringBuilder(str);
		int n = sb.length() / 50;
		if (n > 0) {
			for (int i = n; i > 0; i--) {
				sb.insert(i * 50, "\r\n");
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "12345678901234567890123456789012345678901";
		System.out.println("str长度：" + str.length());

		System.out.println("---开始换行---");
		System.out.println(ChangeLineUtil.changeLine(str));
		System.out.println("---换行完成---");

		System.out.println("str长度2：" + ChangeLineUtil.changeLine(str).length());

	}
}
