package com.syl.test_951_1000;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �?10个数进行排序输出
 * 
 * @author sunyl
 *
 */
public class _963_PrintNumberInOrder {

	public static void main(String[] args) {
		System.out.println("请输�?10个数（用空格隔开）：");
		int[] arr = new int[10];
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			arr[i] = scanner.nextInt();
		}

		scanner.close();

		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
