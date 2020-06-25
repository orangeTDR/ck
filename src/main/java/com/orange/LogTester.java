package com.orange;

import org.apache.log4j.Logger;

public class LogTester {

	private static Logger logger = Logger.getLogger(LogTester.class);
	public static void main(String[] args) {

		logger.error("这是error信息");
		logger.warn("这是warn信息");
		logger.debug("这是debug信息");
		logger.info("这是Info信息");
	}

}
