package com.syl.demos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

@SuppressWarnings("serial")
public class SwingDemoForSaving extends JFrame {
	private JLabel name, phone, sex;
	private JTextField inputName, inputPhone;
	private JComboBox<String> sexBox;
	private String[] item = { "男", "女" };
	private JButton save;

	public SwingDemoForSaving() {
		super("信息管理");
		setSize(240, 300);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));

		name = new JLabel("姓名:");
		phone = new JLabel("手机号:");
		sex = new JLabel("性别:");

		inputName = new JTextField(14);
		inputPhone = new JTextField(14);

		sexBox = new JComboBox<String>(item);

		save = new JButton("储存");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (inputName.getText().equals("") || inputPhone.getText().equals("")) {
					return;
				}

				try {
					File f = new File("info.txt");
					BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));

					if (f.length() == 0) {
						bw.write("姓名\t性别\t手机号");
						bw.newLine();
					}

					String str = inputName.getText() + "\t" + sexBox.getSelectedItem() + "\t" + inputPhone.getText();
					bw.write(str);
					bw.newLine();
					bw.close();
				} catch (Exception ex) {
					System.out.println("fix it, fuck you.");
				}
			}
		});

		getContentPane().setBackground(Color.WHITE);
		getContentPane().add(Box.createHorizontalStrut(5));
		getContentPane().add(name);
		getContentPane().add(inputName);
		getContentPane().add(phone);
		getContentPane().add(inputPhone);
		getContentPane().add(Box.createHorizontalStrut(35));
		getContentPane().add(sex);
		getContentPane().add(sexBox);
		getContentPane().add(Box.createHorizontalStrut(35));
		getContentPane().add(save);

		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(3);
	}

	public static void main(String[] args) {
		new SwingDemoForSaving();
	}
}