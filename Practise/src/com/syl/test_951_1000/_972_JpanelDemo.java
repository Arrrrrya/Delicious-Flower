package com.syl.test_951_1000;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import com.syl.util.DoFactorialUtil;

public class _972_JpanelDemo {
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(JOptionPane.showInputDialog("请输入整数n�? "));
			System.out.println(n + "! = "+new DoFactorialUtil().doFactorial(n));
		} catch (NumberFormatException | HeadlessException e) {
			System.err.println(e.toString());
		}
	}

	static int doFactorial(int n) {
		if (n - 1 > 0) {
			return n * doFactorial(n - 1);
		} else if (n == 1) {
			return n;
		} else {
			return -1;
		}
	}

}
