package com.syl.test;

public class _958_BinaryDemo {

	public static void main(String[] args) {
		byte a = 127;
		byte b = ++a;
		
		System.out.println(b == 128);// false
		System.out.println(b);// -128
		
		byte c = -128;
		byte d = --c;
		System.out.println(d);// 127

	}

}
