package com.syl.demos;

import javax.swing.*;

public class SwingDemo {
	public static void main(String[] args) {
		getMorseCoder();
	}

	// Ӣ��<-->Ħ˹����ת����
	public static void getMorseCoder() {
		JFrame jFrame = new JFrame("Ӣ��<-->Ħ˹����ת����");// ��������
		jFrame.setLocation(500, 200);// ����λ��
		jFrame.setSize(430, 210);// ���ô�С
		jFrame.setResizable(false);// �����Ƿ�ɵ�����С
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// �û��������ڵĹرհ�ťʱ����ִ�еĲ���

		JPanel panel = new JPanel();// ����һ�����
		jFrame.add(panel);// �������ӽ�����

		panel.setLayout(null);// �������Ĳ���

		JLabel englishLabel = new JLabel("Ӣ�ģ�");// ����һ����ǩ
		englishLabel.setBounds(10, 20, 80, 25);// ����λ�ü���С
		panel.add(englishLabel);
		JTextField englishText = new JTextField(20);// ����һ���ı���
		englishText.setBounds(100, 20, 280, 25);
		panel.add(englishText);

		JLabel morseLabel = new JLabel("Ħ˹���룺");
		morseLabel.setBounds(10, 70, 80, 25);
		panel.add(morseLabel);
		JTextField morseText = new JTextField(20);
		morseText.setBounds(100, 70, 280, 25);
		panel.add(morseText);

		JButton e2mButton = new JButton("Ӣ��-->Ħ˹����");
		e2mButton.setBounds(20, 120, 160, 25);
		panel.add(e2mButton);
		JButton m2eButton = new JButton("Ħ˹����-->Ӣ��");
		m2eButton.setBounds(200, 120, 160, 25);
		panel.add(m2eButton);

		jFrame.setVisible(true);// ����Ϊ�ɼ�
	}
}