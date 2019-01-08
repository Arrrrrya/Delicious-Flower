package com.syl.test;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingDemo {
	public static void main(String[] args) {
		// 1 ���� JFrameʵ��
		JFrame frame = new JFrame("Login Example");
		// 2 ����JFrame�Ŀ�͸�
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3 ������壬���Դ��������壬����JFrame��ָ��λ�õ�����п�������ı��ֶΣ���ť�����������
		JPanel panel = new JPanel();
		// 4 ������
		frame.add(panel);
		// 5 �����û�����ķ����������������
		addComponents(panel);
		// 6 ���ý���ɼ�
		frame.setVisible(true);
	}

	private static void addComponents(JPanel panel) {

		// 1 ��������
		panel.setLayout(null);
		// 2 ���� JLabel
		JLabel userLabel = new JLabel("User:");
		// 3 ������������������λ�á� setBounds(x, y, width, height) x �� y ָ�����Ͻǵ���λ�ã��� width ��
		// 4 heightָ���µĴ�С��
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		// 5 �����ı��������û�����
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);
		// 6 ����������ı���
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);
		// 7 �����������������ı��� �����������Ϣ���Ե�Ŵ��棬���ڰ�������İ�ȫ��
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);
		// 8 ������¼��ť
		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		panel.add(loginButton);
	}
}
