package com.syl.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @question ��ȡָ���ļ����������ļ���
 * @link https://www.nowcoder.com/questionTerminal/75dd6dfe8baf40a78762f49268575c8c
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _983_FileDemo {
	public String[] getFileName(String path) {
		File file = new File(path);
		String[] fileName = file.list();
		return fileName;

	}

	public void getAllFileName(String path, ArrayList<String> fileName) {
		File file = new File(path);
		File[] files = file.listFiles();
		String[] names = file.list();
		if (names != null)
			fileName.addAll(Arrays.asList(names));
		for (File a : files) {
			if (a.isDirectory()) {
				getAllFileName(a.getAbsolutePath(), fileName);
			}

		}

	}

	public static void main(String[] args) {
//		String filePath = "x:\\��ֽ";
//		String filePath = "e:\\��ֽ\\΢�Ž�ͼ_20181221202228.png";
		String filePath = "e:\\��ֽ";
		ArrayList<String> fileList = new ArrayList<String>();
		new _983_FileDemo().getAllFileName(filePath, fileList);
		if (null != fileList) {
			for (int i = 0; i < fileList.size(); i++) {
				System.out.println(fileList.get(i));
			}
		}
	}

}
