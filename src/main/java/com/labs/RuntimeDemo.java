package com.labs;

public class RuntimeDemo {

	public static void main(String[] args) {
		
		Runtime runtime = Runtime.getRuntime();
		
		System.out.println("maxMemory : " + runtime.maxMemory());
		System.out.println("totalMemory : " + runtime.totalMemory());
		System.out.println("freeMemory : " + runtime.freeMemory());
		runtime.gc();
		
		
	}
}
