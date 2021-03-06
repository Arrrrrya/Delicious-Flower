package com.syl.test_951_1000;

import java.util.ArrayList;
import java.util.Random;

/**
 * .create 4 random codes(like 4E5g, 369A) from [1-0] and [a-Z]
 * 
 * @author syl
 * @syl the bug is not what you see,but what it is.
 * 
 */
public class _997_RandomCodes {

	public void getRandomCodes() {
		ArrayList<String> codes = new ArrayList<String>();
		for (int i = 0; i <= 9; i++) {
			codes.add(i + "");
		}
		for (int i = 65; i <= 90; i++) {
			codes.add((char) i + "");
		}
		for (int i = 97; i <= 122; i++) {
			codes.add((char) i + "");
		}

		String randomCodes = "";
		int n = 0;
		for (int i = 0; i < 4; i++) {
			n = new Random().nextInt(codes.size());
			randomCodes += codes.get(n);
		}
		System.out.println(randomCodes);
	}

	public void getRandomCodesBySize(int size) {
		ArrayList<String> codes = new ArrayList<String>();
		for (int i = 0; i <= 9; i++) {
			codes.add(i + "");
		}
		for (int i = 65; i <= 90; i++) {
			codes.add((char) i + "");
		}
		for (int i = 97; i <= 122; i++) {
			codes.add((char) i + "");
		}

		String randomCodes = "";
		int n = 0;
		for (int i = 0; i < size; i++) {
			n = new Random().nextInt(codes.size());
			randomCodes += codes.get(n);
		}
		System.out.println(randomCodes);
	}

	public static void main(String[] args) {
		new _997_RandomCodes().getRandomCodes();
		new _997_RandomCodes().getRandomCodesBySize(6);
	}

}
