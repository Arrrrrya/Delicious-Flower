package com.syl.test_951_1000;

/**
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示�?60-89分之间的用B表示�?60分以下的用C表示�?
 * 
 * @author sunyl
 *
 */
public class _969_YunSuanFuDemo {

	public static void main(String[] args) {
		System.out.println(showScoreGrade(50));
		System.out.println(showScoreGrade(60));
		System.out.println(showScoreGrade(90));
	}

	static String showScoreGrade(int score) {
		return (score >= 90) ? "A" : ((score >= 60) ? "B" : "C");
	}

}
