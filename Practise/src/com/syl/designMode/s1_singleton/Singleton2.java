package com.syl.designMode.s1_singleton;

/**
 * 饿汉式
 * 
 * @from
 * @author Arya
 * @email sun_mir@qq.com
 */
public class Singleton2 {
	private final static Singleton2 SINGLETON2 = new Singleton2();

	private Singleton2() {

	}

	public static Singleton2 getSingleton2() {
		return SINGLETON2;
	}
}
