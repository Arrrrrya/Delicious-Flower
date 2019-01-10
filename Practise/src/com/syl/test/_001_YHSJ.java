package com.syl.test;

/*
 * .¥Ú”° ‰»Î—Óª‘»˝Ω«
 * 
 * 1
 * 1	1
 * 1	2	1
 * 1	3	3	1
 * 1	4	6	4	1
 * 1	5	10	10	5	1
 * 1	6	15	20	15	6	1
 * 1	7	21	35	35	21	7	1 
 * 
 * @author arya
 *
 */
public class _001_YHSJ {

	public void getYHSJ(int n) {
		int[][] arr = new int[n][];
		for (int i = 0; i < n; i++) {
			arr[i] = new int[i + 1];
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 10;
		new _001_YHSJ().getYHSJ(n);
	}
}
