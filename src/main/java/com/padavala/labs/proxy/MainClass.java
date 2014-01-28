package com.padavala.labs.proxy;

import java.lang.reflect.Proxy;


public class MainClass {
	public static void main(String... args) {
		
		Test t = (Test) Proxy.newProxyInstance(Test.class.getClassLoader(),
				new Class<?>[] { Test.class }, new TestInvocationHandler(
						new TestImpl()));
		
		System.out.printf(t.hello("Duke"));
		System.out.printf("t.toString(): %s%n", t);
		System.out.printf("t.hashCode(): %H%n", t);
		System.out.printf("t.equals(t): %B%n", t.equals(t));
		System.out.printf("t.equals(new Object()): %B%n",
				t.equals(new Object()));
		System.out.printf("t.equals(null): %B%n", t.equals(null));
	}
}