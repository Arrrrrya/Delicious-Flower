package com.syl.demos;

import javax.swing.*;

public class SwingDemo {
	public static void main(String[] args) {
		getMorseCoder();
	}

	// 英文<-->摩斯密码转换器
	public static void getMorseCoder() {
		JFrame jFrame = new JFrame("英文<-->摩斯密码转换器");// 创建窗体
		jFrame.setLocation(500, 200);// 设置位置
		jFrame.setSize(430, 210);// 设置大小
		jFrame.setResizable(false);// 设置是否可调整大小
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 用户单击窗口的关闭按钮时程序执行的操作

		JPanel panel = new JPanel();// 创建一个面板
		jFrame.add(panel);// 把面板添加进窗体

		panel.setLayout(null);// 设置面板的布局

		JLabel englishLabel = new JLabel("英文：");// 创建一个标签
		englishLabel.setBounds(10, 20, 80, 25);// 设置位置及大小
		panel.add(englishLabel);
		JTextField englishText = new JTextField(20);// 创建一个文本框
		englishText.setBounds(100, 20, 280, 25);
		panel.add(englishText);

		JLabel morseLabel = new JLabel("摩斯密码：");
		morseLabel.setBounds(10, 70, 80, 25);
		panel.add(morseLabel);
		JTextField morseText = new JTextField(20);
		morseText.setBounds(100, 70, 280, 25);
		panel.add(morseText);

		JButton e2mButton = new JButton("英文-->摩斯密码");
		e2mButton.setBounds(20, 120, 160, 25);
		panel.add(e2mButton);
		JButton m2eButton = new JButton("摩斯密码-->英文");
		m2eButton.setBounds(200, 120, 160, 25);
		panel.add(m2eButton);

		jFrame.setVisible(true);// 设置为可见
	}
}