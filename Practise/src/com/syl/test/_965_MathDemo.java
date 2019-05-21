package com.syl.test;

/**
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13…求出这个数列的前20项之和。
 * 
 * @author sunyl
 *
 */
public class _965_MathDemo {

	public static void main(String[] args) {
		float up = 2;// 分子
		float down = 1;// 分母
		float fraction = up / down;// 分数
		float temp = 0;// 交换数
		float sum = 0;// 总和

		for (int i = 0; i < 20; i++) { // 前面20项
			sum += fraction;
			temp = up + down;
			down = up;
			up = temp;
			fraction = up / down;
		}

		long startTime = System.currentTimeMillis();
		String numberString = convertFloat(sum);
		long endTime = System.currentTimeMillis();

		System.out.println(sum + "=" + numberString + "\r\n计算用时： " + (endTime - startTime) + " ms");
	}

	static String convertFloat(float number) {
		String numberString = "";
		for (long i = 2; i > 0; i++) {
			float temp = number * i;
			String string = ("" + temp).split("\\.")[0];
			if (Float.parseFloat(string) == temp) {
				numberString = string + "/" + i;
				break;
			}
		}
		return numberString;
	}

}
