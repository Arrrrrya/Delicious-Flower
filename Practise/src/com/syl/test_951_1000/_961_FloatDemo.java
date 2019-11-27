package com.syl.test_951_1000;

public class _961_FloatDemo {

	public static void main(String[] args) {
		Double result_1 = 0.1 * 0.1;// 0.010000000000000002
		Double result_2 = 0.1 * 0.1f;// 0.010000000149011612
		float result_3 = 0.1f * 0.1f;// 0.010000001

		Double result_4 = 0.1 / 0.1;// 1.0
		Double result_5 = 0.1 / 0.1f;// 0.999999985098839
		float result_6 = 0.1f / 0.1f;// 1.0

		System.out.println(result_1);
		System.out.println(result_2);
		System.out.println(result_3);
		System.out.println(result_4);
		System.out.println(result_5);
		System.out.println(result_6);

		System.out.println(0.1f == 0.1);// false
		System.out.println(Double.parseDouble(0.1f + "") == 0.1);// true
		
		int x = 1;
		System.out.println(x++);// 1
		System.out.println(++x);// 3

	}

}
