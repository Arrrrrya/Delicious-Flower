package com.syl.test_951_1000;

import com.syl.util.DoFactorialUtil;

/**
 * 1.�?1+2!+3!+�?+20!的和 
 * 2.给一个不多于5位的正整数，要求：一、求它是几位数，二�?��?�序打印出各位数字�??
 * 
 * @author sunyl
 *
 */
public class _964_MathDemo {

	public static void main(String[] args) {
		int n = 20;
		long result = 0;
		DoFactorialUtil util = new DoFactorialUtil();
		for (int i = 1; i <= n; i++) {
			result += util.doFactorial(i);
		}
		System.out.println("1+2!+3!+�?+20!=" + result);

		reversePrintNumber(1234);

		reversePrintNumber2(result);
	}

	static void reversePrintNumber(int number) {
		int count = 1;// 位数
		int temp = number;
		System.out.print(number + "逆序输出为： ");
		for (int i = 0; i < 5; i++) {
			if (temp / 10 > 0) {
				count++;
				System.out.print(temp % 10);
				temp = temp / 10;
			} else {
				System.out.print(temp % 10 + "\r\n");
				break;
			}
		}
		System.out.println(number + "�?" + count + "位数");
	}

	static void reversePrintNumber2(long number) {
		String string = "" + number;
		int length = string.length();
		System.out.println(number + "�?" + length + "位数");

		System.out.print(number + "逆序输出为： ");
		for (int i = (length - 1); i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}
}
