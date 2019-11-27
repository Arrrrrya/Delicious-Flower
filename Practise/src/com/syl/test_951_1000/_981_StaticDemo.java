package com.syl.test_951_1000;

/**
 * @question ����̬������������ص�ʱ��ִ�С�����仰�Ǵ�ģ���̬����������౻��ʼ����ʱ��ִ��
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
		// TestStatic.class�ľ�̬�����----����----��ִ��
		System.out.println("test1: " + TestStatic.class);

		System.out.println("------------test2-------------");
		// TestStatic.class�ľ�̬�����----����----��ִ��
		// Class.forName�ڶ�������Ϊboolean initialize��ָ�������Ƿ�Ҫ���г�ʼ��
		try {
			System.out.println(
					"test2: " + Class.forName("com.syl.test.TestStatic", false, TestStatic.class.getClassLoader()));
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}

		System.out.println("------------test3-------------");
		// TestStatic.class�ľ�̬�����----��----��ִ��
		// Class.forName("com.syl.test.TestStatic", true,
		// TestStatic.class.getClassLoader())
		try {
			System.out.println("test3: " + Class.forName("com.syl.test.TestStatic"));
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}

		System.out.println("------------test4-------------");
		// TestStatic.class�ľ�̬�����----����----��ִ��
		try {
			System.out.println("test4: " + Class.forName("com.syl.test.TestStatic"));
		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		}
	}
}

class TestStatic {
	static {
		System.out.println("���ڵ�һ�γ�ʼ��ʱִ�о�̬�����");
	}
}
