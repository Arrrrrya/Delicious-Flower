package com.syl.test_951_1000;

import java.util.ArrayList;

/**
 * 打印�?1000以内�?有的”水仙花数�?�，�?谓�?�水仙花数�?�是指一个三位数，其各位数字立方和等于该数本身�??
 * 例如�?153是一个�?�水仙花数�?�，因为153=1的三次方�?5的三次方�?3的三次方�?
 * 
 * @author sunyl
 *
 */
public class _971_MathDemo {

	public static void main(String[] args) {
		System.out.println(getFlowerNums(1, 1000).toString());
	}

	static ArrayList<Integer> getFlowerNums(int beginInt, int endInt) {
		ArrayList<Integer> resultList = new ArrayList<>();
		int baiWei, shiWei, geWei;
		for (int i = beginInt; i < endInt; i++) {
			baiWei = i / 100;
//			shiWei = i % 100 / 10;
			shiWei = i /10 % 10;
			geWei = i % 10;
			if (i == (baiWei * baiWei * baiWei + shiWei * shiWei * shiWei + geWei * geWei * geWei)) {
				resultList.add(i);
			}
		}
		return resultList;
	}

}
