package com.labs.designpatterns.creationalpatterns.singleton;

public class MySingletonDemo {

	public static void main(String[] args) {
		
		MySingleton singleton = MySingleton.getInstance();
		System.out.println(singleton);
		
		MySingleton anotherSingleton = MySingleton.getInstance();
		System.out.println(anotherSingleton);
		
	}
}
