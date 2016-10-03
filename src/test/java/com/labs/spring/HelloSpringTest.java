package com.labs.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.padavala.labs.spring.HelloSpringWiring;

public class HelloSpringTest {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-module.xml");
		HelloSpringWiring obj = (HelloSpringWiring) context.getBean("springWiring");
		obj.test();
	}
}
