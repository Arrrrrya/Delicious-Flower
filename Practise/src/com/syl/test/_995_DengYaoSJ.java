package com.syl.test;

/*
 * .��ӡ�������������,���4,�������
 *            *
 *           ***
 *          *****
 *         *******
 *   
 * @author syl
 * @syl the bug is not what you see,but what it is.
 */
public class _995_DengYaoSJ {
	public void getDengYaoSJ(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		new _995_DengYaoSJ().getDengYaoSJ(5);
	}
}