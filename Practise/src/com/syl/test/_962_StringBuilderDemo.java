package com.syl.test;

/**
 * String, StringBuffer, stringBuilder的拼接字符串的速度
 * String是字符串常量，StringBuffer和stringBuilder是字符串变量
 * StringBuffer线程安全，stringBuilder线程不安全
 * 
 * @author sunyl
 *
 */
public class _962_StringBuilderDemo {

	public static void main(String[] args) {
		long startCreatString = System.currentTimeMillis();
		String string = "";
		for (int i = 0; i < 1000000; i++) {
			string += 1;
		}
		long endCreatString = System.currentTimeMillis();
		System.out.println("string length = " + string.length() + "\r\ncreate string cost time: "
				+ (endCreatString - startCreatString) + " ms");
		// 697404 ms ≈ 11 min
		
		long startCreatStringBuffer = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < 1000000; i++) {
			stringBuffer.append(1);
		}
		long endCreatStringBuffer = System.currentTimeMillis();
		System.out.println("stringBuffer length = " + stringBuffer.length() + "\r\ncreate stringBuffer cost time: "
				+ (endCreatStringBuffer - startCreatStringBuffer) + " ms");
		// 12 ms
		
		long startCreatStringBuilder = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 1000000; i++) {
			stringBuilder.append(1);
		}
		long endCreatStringBuilder = System.currentTimeMillis();
		System.out.println("stringBuilder length = " + stringBuilder.length() + "\r\ncreate stringBuilder cost time: "
				+ (endCreatStringBuilder - startCreatStringBuilder) + " ms");
		// 8 ms
		
	}

}
