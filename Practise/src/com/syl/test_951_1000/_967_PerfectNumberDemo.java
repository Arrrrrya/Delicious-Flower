package com.syl.test_951_1000;

import java.util.ArrayList;

/**
 * �?个数如果恰好等于它的因子之和，这个数就称为�?�完数�?��?�例�?6=1�?2�?3.编程找出1000以内的所有完数�??
 * 
 * @author sunyl
 *
 */
public class _967_PerfectNumberDemo {

	public static void main(String[] args) {
		int n = 100000;
		ArrayList<Integer> perfectList = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			getPerfectNumber(i, perfectList);
		}
		System.out.println(perfectList.toString());
	}

	static void getPerfectNumber(int n, ArrayList<Integer> perfectList) {
		int count = 0;
		for (int i = 1; i < (n/2+1); i++) {
			if ((n % i == 0)) {
				count += i;
			}
		}
		if (count == n) {
			perfectList.add(n);
		}
	}
}
