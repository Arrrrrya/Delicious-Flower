package com.syl.test_951_1000;

import org.apache.log4j.Logger;

/**
 * 
 * @question ��ϰʹ�� log4j
 * @link https://blog.csdn.net/u012422446/article/details/51199724
 *
 * @author syl(sun_mir@qq.com)
 * @syl the bug is not what you see,but what it is.
 */
public class _980_LogDemo {
	private static Logger logger = Logger.getLogger(_980_LogDemo.class);

	public static void main(String[] args) {
		// ��¼debug�������Ϣ
		logger.debug("This is debug message.");
		// ��¼info�������Ϣ
		logger.info("This is info message.");
		// ��¼error�������Ϣ
		logger.error("This is error message.");
	}
}