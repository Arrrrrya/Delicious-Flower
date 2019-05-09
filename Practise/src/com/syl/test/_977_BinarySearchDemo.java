package com.syl.test;

public class _977_BinarySearchDemo {
	public static void main(String[] args) {
		int[] array = new int[10000000];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		int key = -1;
		
		long beginTime = System.currentTimeMillis();
		int [] result = normalSearch(array, key);
		long endTime = System.currentTimeMillis();
		int index = result[0];
		int count = result[1];
		System.out.println("normalSearch index: " + index + ", count of searching: " + count + ", cost " + (endTime - beginTime) + " ms");
		
		beginTime = System.currentTimeMillis();
		result = binarySearch(array, key);
		endTime = System.currentTimeMillis();
		index = result[0];
		count = result[1];
		System.out.println("binarySearch index: " + index + ", count of searching: " + count + ", cost " + (endTime - beginTime) + " ms");
	}

	static int[] normalSearch(int[] array, int key) {
		int[] result = new int[2];
		int count = 0;
		for (int i : array) {
			count++;
			if (array[i] == key) {
				result[0] = i;
				result[1] = count;
				return result;
			}
		}
		result[0] = -1;
		result[1] = count;
		return result;
	}

	static int[] binarySearch(int[] array, int key) {
		int[] result = new int[2];
		int count = 0;

		int left = 0;
		int right = array.length - 1;

		int mid;
		while (left <= right) {
			count++;
			mid = (left + right) / 2;
			if (array[mid] == key) {
				result[0] = mid;
				result[1] = count;
				return result;
			} else if (array[mid] < key) {
				left = mid + 1;
			} else if (array[mid] > key) {
				right = mid - 1;
			}
		}
		result[0] = -1;
		result[1] = count;
		return result;
	}

}
