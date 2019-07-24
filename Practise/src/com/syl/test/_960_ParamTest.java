package com.syl.test;

public class _960_ParamTest {

	public static void main(String[] args) {
		System.out.println(returnMaxNumber(0, 1, 7));
		System.out.println(returnMaxNumber(101, 3, 4, 6, 100));

		System.out.println(returnSearchStringFirstIndex("a", "b", "b", "b", "b", "a", "b", "b"));

	}

	static int returnMaxNumber(int a, int... b) {
		int max = a;
		for (int i = 0; i < b.length; i++) {
			if (max < b[i]) {
				max = b[i];
			}
		}
		return max;
	}

	static int returnSearchStringFirstIndex(String a, String... b) {
		int index = 0;
		for (int i = 0; i < b.length; i++) {
			if (a.equals(b[i])) {
				break;
			} else {
				index++;
			}
		}
		return index;
	}

}
