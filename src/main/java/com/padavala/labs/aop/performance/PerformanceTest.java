package com.padavala.labs.aop.performance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformanceTest {

	public static void main(String[] args){
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-module.xml");
		Business business = (Business) appContext.getBean("business");

		business.doSomeOperation();
		business.do2();
		
		Other other = (Other) appContext.getBean("other");
		other.doSomething1();
		other.doSomething2();
	}
}
