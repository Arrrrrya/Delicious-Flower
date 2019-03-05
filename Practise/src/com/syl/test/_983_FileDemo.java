package com.syl.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @question 获取指定文件夹内所有文件名
 * @link https://www.nowcoder.com/questionTerminal/75dd6dfe8baf40a78762f49268575c8c
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _983_FileDemo {
	public void getAllFileName(String path, ArrayList<String> fileName) {
		File file = new File(path);
		if (!file.exists()) {
			System.out.println("wrong path !");
			return;
		}

		File[] files = file.listFiles();
		for (File f : files) {
			fileName.add(f.getAbsolutePath());
			if (f.isDirectory()) {
				getAllFileName(f.getAbsolutePath(), fileName);
			}
		}
	}

	void writeToFile(String resultFile, ArrayList<String> fileList) {
		try {
			File file = new File(resultFile);
			if (file.exists()) {
				file.delete();
			}
			FileWriter out = new FileWriter(file, true);
			String data = "";
			for (int i = 0; i < fileList.size(); i++) {
				data = fileList.get(i);
				out.write(data + "\r\n");
			}
			out.close();
			System.out.println("\nall fileNames are written into " + file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String filePath = "E:\\Z_test";
		ArrayList<String> fileList = new ArrayList<String>();
		new _983_FileDemo().getAllFileName(filePath, fileList);

		for (int i = 0; i < fileList.size(); i++) {
			System.out.println(fileList.get(i));
		}

		String resultFile = "D:\\z.txt";
		new _983_FileDemo().writeToFile(resultFile, fileList);

	}

}
