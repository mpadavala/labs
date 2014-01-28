package com.padavala.labs.aop.performance;

import org.springframework.stereotype.Component;

@Component("other")
public class Other {

	public void doSomething1() {
		System.out.println("doing something..");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println("Interrupted..");
		}
		System.out.println("out of something..");
	}
	
	public void doSomething2() {
		System.out.println("doing something..");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			System.out.println("Interrupted..");
		}
		System.out.println("out of something..");
	}
}
