package com.syl.util;

public class DivisionUtil {

	public static void main(String[] args) {
		// 除法四舍五入(分子,分母,保留小数位数)
		System.out.println(doDivision(-2, -3, 3));// 0.667
		System.out.println(doDivision(20, 2, 3));// 10.000
		System.out.println(doDivision(5, 8, 0));// 1
	}

	static String doDivision(int fenZi, int fenMu, int remainNumber) {
		if (remainNumber < 0) {
			System.err.println("ERROR: the 3rd param [" + remainNumber + "] is invalid !");
			return "";
		}

		String result = Double.parseDouble(fenZi + "") / Double.parseDouble(fenMu + "") + "";
		String[] resultStrings = (result).split("\\.");
		String beforeDot = resultStrings[0];

		if (resultStrings[1].length() <= remainNumber) {
			for (int i = 0; i < (remainNumber - resultStrings[1].length()); i++) {
				result += "0";
			}
			return result;
		}

		String afterDot = "";
		if (remainNumber > 0) {
			afterDot = resultStrings[1].substring(0, remainNumber);
		}

		char flagNumber = resultStrings[1].charAt(remainNumber);

		if (Double.parseDouble(flagNumber + "") > 4) {
			if (remainNumber > 0) {
				result = beforeDot + "." + (Integer.parseInt(afterDot) + 1);
			} else {
				result = (Integer.parseInt(beforeDot) + 1) + "";
			}
		} else {
			if (remainNumber > 0) {
				result = beforeDot + "." + afterDot;
			} else {
				result = beforeDot;
			}
		}

		return result;
	}

}
