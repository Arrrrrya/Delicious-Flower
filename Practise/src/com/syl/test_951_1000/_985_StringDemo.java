package com.syl.test_951_1000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @question 将AB2C3D4ESF6G7H8拆分开来,并按顺序存入int[]和String[]数组。
 * @link https://www.nowcoder.com/questionTerminal/b843e6c9627c4da4bd80a072784c2c96
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _985_StringDemo {

	public void separateString(String str) {

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
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(strArray));

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void separateStr(String str) {
		List intList = new ArrayList<>();
		List stringList = new ArrayList<>();

		Pattern pattern1 = Pattern.compile("\\d"); // 匹配数字
		Pattern pattern2 = Pattern.compile("\\D"); // 匹配非数字

		Matcher m1 = pattern1.matcher(str);
		Matcher m2 = pattern2.matcher(str);

		while (m1.find()) {
			intList.add(m1.group());
		}
		System.out.println(Arrays.toString(intList.toArray()));

		while (m2.find()) {
			stringList.add(m2.group());
		}
		System.out.println(Arrays.toString(stringList.toArray()));
	}

	public static void main(String[] args) {
		new _985_StringDemo().separateString("AB2C3D4ESF6G7H8");

		new _985_StringDemo().separateStr("AB2C3D4ESF6G7H8");
	}
}
