package com.syl.util;

public class DivisionUtil {

	public static void main(String[] args) {
		// 结果保留3位小数(四舍五入)
		System.out.println(doDivision(2, 3, 3));// 0.667
		System.out.println(doDivision(20, 2, 3));// 10.000
		System.out.println(doDivision(5, 8, 1));// 0.13

	}

	static String doDivision(int fenZi, int fenMu, int remainNumber) {
		String result = Double.parseDouble(fenZi + "") / Double.parseDouble(fenMu + "") + "";
		String[] resultStrings = (result).split("\\.");
		String beforeDot = resultStrings[0];
		
		if (resultStrings[1].length() <= remainNumber) {
			for (int i = 0; i < (remainNumber - resultStrings[1].length()); i++) {
				result += "0";
			}
			return result;
		}
		

		
		String afterDot = resultStrings[1].substring(0, remainNumber);
		char flagNumber = resultStrings[1].charAt(remainNumber);
		
		if(remainNumber != 0){
			if (Double.parseDouble(flagNumber + "") > 4) {
				result = beforeDot + "." + (Integer.parseInt(afterDot) + 1);
			} else {
				result = beforeDot + "." + afterDot;
			}
		}else {
			
		}
		
		return result;
	}

}
