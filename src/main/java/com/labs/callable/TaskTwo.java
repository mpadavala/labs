package com.labs.callable;

import java.util.concurrent.Callable;

public class TaskTwo implements Callable<String> {

	private static final int TWO_THOUSAND = 2000;
	
	@Override
	public String call() throws Exception {
		Thread.sleep(TWO_THOUSAND);
		return "Executed Task Two after sleeping for " + TWO_THOUSAND + "milliseconds";
	}
}
