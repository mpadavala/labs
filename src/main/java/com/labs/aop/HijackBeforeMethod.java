package com.labs.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;
 
@Component
public class HijackBeforeMethod implements MethodBeforeAdvice {
	
	public void before(Method method, Object[] args, Object target)
		throws Throwable {
	        System.out.println("HijackBeforeMethod : Before method hijacked!");
	}
}