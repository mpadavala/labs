package com.labs.callable;

import java.util.concurrent.Callable;

public class CallableTaskTwo implements Callable<String> {

	private static final int TWO_THOUSAND = 2000;
	
	@Override
	public String call() {
		try {
			Thread.sleep(TWO_THOUSAND);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Executed Task Two after sleeping for " + TWO_THOUSAND + "milliseconds";
	}
}
