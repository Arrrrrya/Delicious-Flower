package com.syl.test_951_1000;

/**
 * 
 * @question ����һ��Student[]���鱣����Student������ΪͨѶ¼���ݡ������ͨ��name��email��address��ѯ,����Ҳ�������,������Ѻ���ʾ��
 * @link https://www.nowcoder.com/questionTerminal/97ea42e4833141f48e6e751d50cbb6f7
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _989_StudentDemo2 {
	public static void main(String[] args) {
		_990_StudentDemo[] students = new _990_StudentDemo[3];
		students[0] = new _990_StudentDemo("arya");
		students[1] = new _990_StudentDemo("arya");
		students[2] = new _990_StudentDemo("syl");

		new _989_StudentDemo2().find(students, "syl");
	}

	public void find(_990_StudentDemo[] students, String name) {
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
