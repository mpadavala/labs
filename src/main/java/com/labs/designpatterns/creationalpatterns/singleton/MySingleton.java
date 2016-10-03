package com.labs.designpatterns.creationalpatterns.singleton;

public class MySingleton {

	private static MySingleton instance = new MySingleton();
	
	private MySingleton(){
		//Keep it empty
	}
	
	public static MySingleton getInstance(){
		return instance;
	}
}
