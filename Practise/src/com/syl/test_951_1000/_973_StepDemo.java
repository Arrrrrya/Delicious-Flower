package com.syl.test_951_1000;

/**
 * 台阶问题�? 楼梯有n阶，上楼可以�?步上�?阶，也可以一步上二阶。编�?个程序，计算共有多少种不同的走法
 * 
 * @author sunyl
 *
 */
public class _973_StepDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 15; i++) {
			System.out.print(stepCount(i) + ", ");
		}
	}

	static int stepCount(int n) {
		if (n > 2) {
			return stepCount(n - 1) + stepCount(n - 2);
		} else if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else {
			return -1;
		}
	}
}
