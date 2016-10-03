package com.labs.designpatterns.creationalpatterns.singleton;

public class MySingletonLazyLoad {

	private static MySingletonLazyLoad instance = null;
	
	private MySingletonLazyLoad(){
		//Keep it empty
	}
	
	public static MySingletonLazyLoad getInstance(){
		
		if(instance == null){
			synchronized(MySingletonLazyLoad.class){
				if(instance == null){
					instance = new MySingletonLazyLoad();
				}
			}
		}
		return instance;
	}
}
