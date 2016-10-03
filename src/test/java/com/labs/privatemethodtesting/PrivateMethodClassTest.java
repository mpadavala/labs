package com.labs.privatemethodtesting;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class PrivateMethodClassTest {

	@Test
	public void testPrivateMethodWithNoArguments() throws SecurityException,
			NoSuchMethodException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {

		PrivateMethodClass myClass = new PrivateMethodClass();
		Method method = PrivateMethodClass.class
				.getDeclaredMethod("getStringFromPrivateMethod");
		method.setAccessible(true);
		String output = (String) method.invoke(myClass);
		System.out.println("Method : " + method);
		System.out.println("ouput : " + output);
	}

	@Test
	public void testPrivateMethodWithArguments() throws SecurityException,
			NoSuchMethodException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {

		PrivateMethodClass myClass = new PrivateMethodClass();
		Method method = PrivateMethodClass.class.getDeclaredMethod(
				"getStringFromPrivateMethod", String.class);
		method.setAccessible(true);
		String output = (String) method.invoke(myClass, "Murali");
		System.out.println("Method : " + method);
		System.out.println("ouput : " + output);

	}

}
