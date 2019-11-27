package com.syl.test_951_1000;

import java.util.Scanner;

/**
 * 输入�?行字符，分别统计出其英文字母、空格�?�数字和其它字符的个数�?? 1.对比每一个数值在ASK码的范围，就可以确定它符号的类别
 * 2.char字符ASK码的范围：（1）数�?0�?9�? 48~57�?2）；字母A到Z�?65�?90，a到z�?97�?122；（3）空格是32
 * 
 * @author sunyl
 *
 */
public class _968_StringDemo {

	public static void main(String[] args) {
		System.out.println("请输入：");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		doCount(string);
		scanner.close();
	}

	static void doCount(String string) {
		char[] arr = string.toCharArray();
		int word = 0;
		int blank = 0;
		int number = 0;
		int other = 0;
		for (Character character : arr) {
			if (character >= 48 && character <= 57) {
				number++;
			} else if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
				word++;
			} else if (character == 32) {
				blank++;
			} else {
				other++;
			}
		}
		System.out.println("英语字母个数�? " + word + "\r\n数字个数�? " + number + "\r\n空格个数�? " + blank + "\r\n其他字符个数�? " + other);
	}

}
