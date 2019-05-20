package com.syl.test;

/**
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 
 * @author sunyl
 *
 */
public class _970_SeparateNumberDemo {
	public static void main(String[] args) {
		int n = 100;
		System.out.println(n + " = " + separateNumber(n));
	}

	static String separateNumber(int n) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 2; i <= n; i++) {
			while ((n % i == 0)) {
				stringBuilder.append(i + " ");
				n = n / i;
			}
		}

		return stringBuilder.toString().trim().replace(" ", "*");
	}

}
