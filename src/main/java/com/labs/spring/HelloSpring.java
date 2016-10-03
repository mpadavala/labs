package com.labs.spring;

import org.springframework.stereotype.Component;

@Component("helloBean")
public class HelloSpring {
	
	private String name = "Murali";
	 
	public void setName(String name) {
		this.name = name;
	}
 
	public void printHello() {
		System.out.println("Hello ! " + name);
	}

}
