package com.syl.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.apache.log4j.Logger;

/**
 * 
 * @question 复制5000本csr文件，每本csr中只有2处ID不同，0001-5000顺序自增
 * @link
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class FileCopyUtil {
	private static Logger logger = Logger.getLogger(FileCopyUtil.class);
	static String encoding = "UTF-8";

	public static void main(String[] args) {
		String srcPath = "c:\\csr_copy\\T0001P.csr";
		File srcFile = new File(srcPath);

		Long nowTime = 0L;

		if (srcFile.isFile()) {
			nowTime = System.currentTimeMillis();
			logger.info("start to copy...");
		} else {
			logger.error("pls check src file");
			return;
		}

		String pathStart = "c:\\csr_copy\\T";
		String fileCount = "";
		String pathEnd = "P.csr";

		String copyFilePath;
		File temp;
		int fileNum = 5000;
		for (int i = 2; i < (fileNum + 1); i++) {
			if (i < 10) {
				fileCount = "000" + i;
			} else if (i < 100 && i > 9) {
				fileCount = "00" + i;
			} else if (i < 1000 && i > 99) {
				fileCount = "0" + i;
			} else if (i > 999) {
				fileCount = "" + i;
			}

			copyFilePath = pathStart + fileCount + pathEnd;
			temp = new File(copyFilePath);
			try {
				temp.createNewFile();
				copyFile(srcFile, temp);
				logger.info("copy: " + temp.getPath());
				updateFile(temp.getPath(), fileCount);
			} catch (IOException e) {
				logger.error(e.toString());
			}
		}

		logger.info("finish copy, cost time: " + (System.currentTimeMillis() - nowTime) + " ms");
	}

	private static void copyFile(File srcFile, File targetFile) throws IOException {
		FileInputStream in = new FileInputStream(srcFile);
		BufferedInputStream inBuff = new BufferedInputStream(in);
		FileOutputStream out = new FileOutputStream(targetFile);
		BufferedOutputStream outBuff = new BufferedOutputStream(out);

		byte[] b = new byte[1024 * 5];
		int len;
		while ((len = inBuff.read(b)) != -1) {
			outBuff.write(b, 0, len);
		}

		outBuff.flush();

		if (null != inBuff) {
			inBuff.close();
		}
		if (null != outBuff) {
			outBuff.close();
		}
		if (null != out) {
			out.close();
		}
		if (null != in) {
			in.close();
		}

	}

	private static void updateFile(String fileName, String fileCount) throws IOException {
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader is = new InputStreamReader(fis, encoding);
		BufferedReader br = new BufferedReader(is);

		StringBuffer bufAll = new StringBuffer();
		StringBuffer buf;
		String line = null;
		while ((line = br.readLine()) != null) {
			buf = new StringBuffer();
			if (line.startsWith("<sql id=")) {
				buf.append(line);
				buf.replace(10, 14, fileCount);
				bufAll.append(buf + "\r\n");
			} else if (line.endsWith("W-KEY.")) {
				buf.append(line);
				buf.replace(25, 29, fileCount);
				bufAll.append(buf + "\r\n");
			} else {
				bufAll.append(buf + "\r\n");
			}
		}
		if (null != br) {
			br.close();
		}

		FileOutputStream fos = new FileOutputStream(fileName);
		OutputStreamWriter os = new OutputStreamWriter(fos, encoding);
		BufferedWriter bw = new BufferedWriter(os);

		bw.write(bufAll.toString());

		if (null != bw) {
			bw.close();
		}
	}

}
