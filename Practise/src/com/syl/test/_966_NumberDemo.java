package com.syl.test;

import java.util.ArrayList;
import java.util.Random;

/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 
 * @author sunyl
 *
 */
public class _966_NumberDemo {
	static int[] array = { 1, 2, 3, 4 };

	public static void main(String[] args) {
		System.out.println(getNumber(array).size());
		System.out.println(getNumber(array).toString());
	}

	static ArrayList<Integer> getNumber(int[] array) {
		ArrayList<Integer> resultArray = new ArrayList<>();
		
		int number = 0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int k = 1; k < 5; k++) {
					number = i * 100 + j * 10 + k;
					if (i != j && j != k && i != k) {
						resultArray.add(number);
					}
				}
			}
		}

		return resultArray;
	}

}
