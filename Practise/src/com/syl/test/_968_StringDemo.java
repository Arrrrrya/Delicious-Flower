package com.syl.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 输入一行字符，分别统计出其英文字母、空格、数字和其它字符的个数。 1.对比每一个数值在ASK码的范围，就可以确定它符号的类别
 * 2.char字符ASK码的范围：（1）数字0到9： 48~57（2）；字母A到Z：65到90，a到z：97到122；（3）空格是32
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
		ArrayList<Character> cList = new ArrayList<>();
		int word = 0;
		int blank = 0;
		int number = 0;
		int other = 0;
		for (int i = 0; i < string.length(); i++) {
			cList.add(string.charAt(i));
		}
		for (Character character : cList) {
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
		System.out.println("英语字母个数： " + word + "\r\n数字个数： " + number + "\r\n空格个数： " + blank + "\r\n其他字符个数： " + other);
	}

}
