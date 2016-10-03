package com.labs.aop;

import org.springframework.stereotype.Component;

@Component("customerService")
public class CustomerService {
	private String name="test name";
	private String url="test url";

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void printName() {
		System.out.println("Customer name : " + this.name);
	}

	public void printURL() {
		System.out.println("Customer website : " + this.url);
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}

}