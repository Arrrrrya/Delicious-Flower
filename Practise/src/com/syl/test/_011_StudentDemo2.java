package com.syl.test;

/**
 * 
 * @question 定义一个Student[]数组保存多个Student对象作为通讯录数据。程序可通过name、email、address查询,如果找不到数据,则进行友好提示。
 * @link https://www.nowcoder.com/questionTerminal/97ea42e4833141f48e6e751d50cbb6f7
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _011_StudentDemo2 {
	public static void main(String[] args) {
		_010_StudentDemo[] students = new _010_StudentDemo[3];
		students[0] = new _010_StudentDemo("arya");
		students[1] = new _010_StudentDemo("arya");
		students[2] = new _010_StudentDemo("syl");

		new _011_StudentDemo2().find(students, "syl");
	}

	public void find(_010_StudentDemo[] students, String name) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i].getName().equals(name)) {
				System.out.println(students[i]);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("not find");
		}
	}
}
