package com.labs.callable;

import java.util.concurrent.Callable;

public class TaskOne implements Callable<String> {

	private static final int FIVE_THOUSAND = 5000;
	
	@Override
	public String call() throws Exception {
		Thread.sleep(FIVE_THOUSAND);
		return "Executed Task One after sleeping for " + FIVE_THOUSAND + "milliseconds";
	}
}