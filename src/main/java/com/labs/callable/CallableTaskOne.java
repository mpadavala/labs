package com.labs.callable;

import java.util.concurrent.Callable;

public class CallableTaskOne implements Callable<String> {

	private static final int FIVE_THOUSAND = 5000;
	
	@Override
	public String call() {
		try {
			Thread.sleep(FIVE_THOUSAND);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Executed Task One after sleeping for " + FIVE_THOUSAND + "milliseconds";
	}
}