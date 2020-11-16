package com.syl.designMode.s1_singleton;

/**
 * 懒汉式
 * 
 * @from
 * @author Arya
 * @email sun_mir@qq.com
 */
public class Singleton {
	private volatile static Singleton singleton;
	private static Object syncRootObject = new Object();

	private Singleton() {
	}

	public static Singleton getSingleton() {
		// 添加双重锁定
		if (singleton == null) {
			synchronized (syncRootObject) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
