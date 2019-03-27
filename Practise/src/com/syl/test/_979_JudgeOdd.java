package com.syl.test;

/**
 * 
 * @question �ж�һ�������Ƿ�Ϊ����
 * @link �ο�https://www.cnblogs.com/yesiamhere/p/6675067.html
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _979_JudgeOdd {

	public static void main(String[] args) {
		int i = 13;
		System.out.println(isOdd(i));
		System.out.println(isOdd2(i));
		System.out.println(isOdd3(i));
		System.out.println(isOdd4(i));

		System.out.println(i >> 1);
		System.out.println(i << 1);
	}

	static boolean isOdd(int i) {
		// λ�����&
		return (i & 1) == 1;
	}

	static boolean isOdd2(int i) {
		return (i % 2) != 0;
	}

	static boolean isOdd3(int i) {
		// λ�����,>>�൱��i/2,<<�൱��i*2
		return i >> 1 << 1 != i;
	}

	static boolean isOdd4(int i) {
		return i / 2 * 2 != i;
	}

}
