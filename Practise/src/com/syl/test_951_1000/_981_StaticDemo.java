package com.syl.test_951_1000;

/**
 * @question “静态代码块会在类加载的时候执行”，这句话是错的，静态代码块是在类被初始化的时候执行
 * @link
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _981_StaticDemo {
	static {
		System.out.println("i'm static of _981_StaticDemo.");
	}

	public static void main(String[] args) {
		System.out.println("------------test1-------------");
		// TestStatic.class的静态代码块----不会----被执行
		System.out.println("test1: " + TestStatic.class);

		System.out.println("------------test2-------------");
		// TestStatic.class的静态代码块----不会----被执行
		// Class.forName第二个参数为boolean initialize，指定该类是否要进行初始化
		try {
			System.out.println(
					"test2: " + Class.forName("com.syl.test.TestStatic", false, TestStatic.class.getClassLoader()));
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}

		System.out.println("------------test3-------------");
		// TestStatic.class的静态代码块----会----被执行
		// Class.forName("com.syl.test.TestStatic", true,
		// TestStatic.class.getClassLoader())
		try {
			System.out.println("test3: " + Class.forName("com.syl.test.TestStatic"));
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}

		System.out.println("------------test4-------------");
		// TestStatic.class的静态代码块----不会----被执行
		try {
			System.out.println("test4: " + Class.forName("com.syl.test.TestStatic"));
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}
}

class TestStatic {
	static {
		System.out.println("类在第一次初始化时执行静态代码块");
	}
}
