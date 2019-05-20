package com.syl.util;

import java.util.ArrayList;

public class GetPrimeUtil {
	public static void main(String[] args) {
		GetPrimeUtil getPrimeUtil = new GetPrimeUtil();
		System.out.println(getPrimeUtil.getPrime(100, 200).toString());

		for (int i = 1; i <= 50; i++) {
			System.out.print(getPrimeUtil.getPrime(100 * i, 100 * i + 100).size()+" ");
		}
	}

	public ArrayList<Integer> getPrime(int beginInt, int endInt) {
		ArrayList<Integer> resultList = new ArrayList<>();

		if (beginInt <= 2) {
			beginInt = 2;
		}

		boolean flag;
		for (int i = beginInt; i < endInt; i++) {
			flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
					break;
				}
			}
			if (flag == true) {
				continue;
			}
			resultList.add(i);
		}

		return resultList;
	}
}
