package com.padavala.labs.aop.performance;

import org.springframework.stereotype.Component;

@Component("business")
public class BusinessImpl implements Business {

	public void doSomeOperation() {
		System.out.println("sleeping..");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("Interrupted..");
		}
		System.out.println("Wokeup..");
	}
	
	public void do2() {
		System.out.println("sleeping..");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			System.out.println("Interrupted..");
		}
		System.out.println("Wokeup..");
	}
	

}