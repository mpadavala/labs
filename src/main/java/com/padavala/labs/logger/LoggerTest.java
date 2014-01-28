package com.padavala.labs.logger;

import org.apache.log4j.Logger;

public class LoggerTest {

	private static final Logger logger = Logger.getLogger(LoggerTest.class);

	public static void main(String[] args) {
		for (int i = 0; i < 100000000; i++) {
			try {
				logger.debug("Hello World " + i);
				//Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
