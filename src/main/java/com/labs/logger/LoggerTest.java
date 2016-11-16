package com.labs.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {

	private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

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
