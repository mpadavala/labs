package com.labs.designpatterns.creationalpatterns.singleton;

public class MySingletonLazyLoadDemo {

	public static void main(String[] args) {
		
		MySingletonLazyLoad singletonLazyLoad = MySingletonLazyLoad.getInstance();
		System.out.println(singletonLazyLoad);
		
		MySingletonLazyLoad anotherSingletonLazyLoad = MySingletonLazyLoad.getInstance();
		System.out.println(anotherSingletonLazyLoad);
		
	}
}
