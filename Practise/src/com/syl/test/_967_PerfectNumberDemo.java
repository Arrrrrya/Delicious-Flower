package com.syl.test;

import java.util.ArrayList;

/**
 * 一个数如果恰好等于它的因子之和，这个数就称为”完数”。例如6=1＋2＋3.编程找出1000以内的所有完数。
 * 
 * @author sunyl
 *
 */
public class _967_PerfectNumberDemo {

	public static void main(String[] args) {
		int n = 10000;
		ArrayList<Integer> perfectList = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			getPerfectNumber(i, perfectList);
		}
		System.out.println(perfectList.toString());
	}

	static void getPerfectNumber(int n, ArrayList<Integer> perfectList) {
		int count = 0;
		for (int i = 1; i < n; i++) {
			if ((n % i == 0)) {
				count += i;
			}
		}
		if (count == n) {
			perfectList.add(n);
		}
	}
}
