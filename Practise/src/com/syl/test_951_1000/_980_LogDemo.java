package com.syl.test_951_1000;

import org.apache.log4j.Logger;

/**
 * 
 * @question 练习使用 log4j
 * @link https://blog.csdn.net/u012422446/article/details/51199724
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _980_LogDemo {
	private static Logger logger = Logger.getLogger(_980_LogDemo.class);

	public static void main(String[] args) {
		// 记录debug级别的信息
		logger.debug("This is debug message.");
		// 记录info级别的信息
		logger.info("This is info message.");
		// 记录error级别的信息
		logger.error("This is error message.");
	}
}