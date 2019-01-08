package com.syl.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingDemo {
	public static void main(String[] args) {
		// 1 创建 JFrame实例
		JFrame frame = new JFrame("Login Example");
		// 2 设置JFrame的宽和高
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3 创建面板，可以创建多个面板，并在JFrame中指定位置的面板中可以添加文本字段，按钮及其他组件。
		JPanel panel = new JPanel();
		// 4 添加面板
		frame.add(panel);
		// 5 调用用户定义的方法并添加组件到面板
		addComponents(panel);
		// 6 设置界面可见
		frame.setVisible(true);
	}

	private static void addComponents(JPanel panel) {

		// 1 布局设置
		panel.setLayout(null);
		// 2 创建 JLabel
		JLabel userLabel = new JLabel("User:");
		// 3 这个方法定义了组件的位置。 setBounds(x, y, width, height) x 和 y 指定左上角的新位置，由 width 和
		// 4 height指定新的大小。
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		// 5 创建文本域用于用户输入
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		// 6 输入密码的文本域
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		// 7 这个类似用于输入的文本域 但是输入的信息会以点号代替，用于包含密码的安全性
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		// 8 创建登录按钮
		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
	}
}
