package com.syl.util;

public class DoFactorialUtil {

	public long doFactorial(int n){
		if (n - 1 > 0) {
			return n * doFactorial(n - 1);
		} else if (n == 1) {
			return n;
		} else {
			return -1;
		}
	}

}
