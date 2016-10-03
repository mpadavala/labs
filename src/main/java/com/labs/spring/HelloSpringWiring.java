package com.labs.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("springWiring")
public class HelloSpringWiring {
	
	@Autowired
	HelloSpring helloBean;
	
	public void test() {
		helloBean.printHello();
	}
	
	
	/*
	@Autowired
	@Qualifier("helloBean")
	HelloSpring helloBean;
	
	public static void main(String[] args) {
		HelloSpringTest test = new HelloSpringTest();
		test.helloBean.printHello();
	}
	*/
}
