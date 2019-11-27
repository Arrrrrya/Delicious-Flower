package com.syl.test_951_1000;

public class _958_BinaryDemo {

	public static void main(String[] args) {
		byte a = 127;
		byte b = ++a;
		
		System.out.println(b == 128);// false
		System.out.println(b);// -128
		
		byte c = -128;
		byte d = --c;
		System.out.println(d);// 127
		
		int e = 8;
		System.out.println(e << 3);// 64
		System.out.println(e >> 3);// 1
		System.out.println(e >>> 3);// 1 无符号右�?
		

	}

}
