package com.syl.test;

/**
 * .打印输入九九乘法表
 * 
 * @author syl
 * @syl the bug is not what you see,but what it is.
 */
public class _996_ChengFaBiao {
	public void getChengFaBiao(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "x" + j + "=" + i * j + "\t");
				if (j == i) {
					System.out.println();
				}
			}

		}
	}

	public static void main(String[] args) {
		new _996_ChengFaBiao().getChengFaBiao(9);
	}
}