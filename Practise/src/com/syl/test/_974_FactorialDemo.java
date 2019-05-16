package com.syl.test;

/**
 * 计算n的阶乘 n!
 * 
 * @author sunyl
 *
 */
public class _974_FactorialDemo {

	public static void main(String[] args) {
		long n = 5L;

		System.out.println(factorial(n));
		System.out.println(doFactorial(n));
	}

	static long factorial(long n) {
		if (n < 0) {
			return -1;
		} else {
			long result = n;
			while (n - 1 > 0) {
				result *= (n - 1);
				n = n - 1;
			}
			return result;
		}
	}

	static long doFactorial(long n) {
		if (n - 1 > 0) {
			return n * doFactorial(n - 1);
		} else if (n == 1) {
			return n;
		} else {
			return -1;
		}
	}

}
