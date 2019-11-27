package com.syl.test_951_1000;

/**
 * 
 * @question 获取n以内的质数
 * @link  
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _986_GetPrime {
	public void getPrime(int n) {
		boolean flag;
		for (int i = 2; i < n; i++) {
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
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		new _986_GetPrime().getPrime(100);
	}
}
