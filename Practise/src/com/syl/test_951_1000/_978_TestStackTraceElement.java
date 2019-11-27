package com.syl.test_951_1000;

public class _978_TestStackTraceElement {

	public static void main(String[] args) {
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();

		System.out.println("main stacks size: " + stacks.length);

//		System.out.println("类名：" + stacks[0].getClassName());
//		System.out.println("函数名：" + stacks[0].getMethodName());
//		System.out.println("文件名：" + stacks[0].getFileName());
//		System.out.println("行号：" + stacks[0].getLineNumber());

		Test();
	}

	static void Test() {
		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();
		System.out.println("test stacks size: " + stacks.length);
		for (int i = 0; i < stacks.length; i++) {
			System.out.println("---" + (i + 1) + "---");
			System.out.println("类名：" + stacks[i].getClassName());
			System.out.println("函数名：" + stacks[i].getMethodName());
			System.out.println("文件名：" + stacks[i].getFileName());
			System.out.println("行号：" + stacks[i].getLineNumber());
		}
		
	}

}
