package com.syl.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @question 获取指定文件夹内所有文件名
 * @link https://www.nowcoder.com/questionTerminal/75dd6dfe8baf40a78762f49268575c8c
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _983_FileDemo {
	void getAllFileName(String path, ArrayList<String> fileName) {
		File file = new File(path);
		if (!file.exists()) {
			System.err.println("wrong path !");
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
			FileWriter fileWriter = new FileWriter(file, true);
			for (String fileName : fileList) {
				fileWriter.write(fileName + "\r\n");
			}
			fileWriter.close();
			System.out.println("\nall fileNames are written into " + file.getAbsolutePath());
		} catch (IOException e) {
			System.err.println(e.toString());
		}
	}

	public static void main(String[] args) {
		String filePath = "E:\\Z_test";
		ArrayList<String> fileList = new ArrayList<String>();
		new _983_FileDemo().getAllFileName(filePath, fileList);

		for (String f : fileList) {
			System.out.println(f);
		}

		if (!fileList.isEmpty()) {
			String resultFile = "D:\\z.txt";
			new _983_FileDemo().writeToFile(resultFile, fileList);
		}
	}
}
