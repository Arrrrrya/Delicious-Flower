package com.syl.test;

import java.util.Arrays;

/**
 * 
 * @question 将AB2C3D4ESF6G7H8拆分开来,并按顺序存入int[]和String[]数组。
 * @link https://www.nowcoder.com/questionTerminal/b843e6c9627c4da4bd80a072784c2c96
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _085_ObjectDemo {

	public Object[] separateString(String str) {
		Object[] result = new Object[2];

		int intArrayLen = 0;
		int StringArrayLen = 0;

		int tempNum = 0;
		String temString = "";

		for (int i = 0; i < str.length(); i++) {
			try {
				tempNum = Integer.parseInt(str.charAt(i) + "");
				intArrayLen++;
			} catch (NumberFormatException e) {
				temString = str.charAt(i) + "";
				StringArrayLen++;
			}
		}
		int[] intArray = new int[intArrayLen];
		String[] strArray = new String[StringArrayLen];

		intArrayLen = 0;
		StringArrayLen = 0;
		for (int i = 0; i < str.length(); i++) {
			try {
				tempNum = Integer.parseInt(str.charAt(i) + "");
				intArrayLen++;
				intArray[intArrayLen - 1] = tempNum;
			} catch (NumberFormatException e) {
				temString = str.charAt(i) + "";
				StringArrayLen++;
				strArray[StringArrayLen - 1] = temString;
			}
		}

		result[0] = intArray;
		result[1] = strArray;
		return result;
	}

	public static void main(String[] args) {
		int[] intArray = (int[]) new _085_ObjectDemo().separateString("AB2C3D4ESF6G7H8")[0];
		System.out.println(Arrays.toString(intArray));
		String[] strArray = (String[]) new _085_ObjectDemo().separateString("AB2C3D4ESF6G7H8")[1];
		System.out.println(Arrays.toString(strArray));
	}
}
