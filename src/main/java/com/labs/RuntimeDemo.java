package com.labs;

public class RuntimeDemo {

	public static void main(String[] args) {
		
		System.out.println("maxMemory : " + Runtime.getRuntime().maxMemory());
		System.out.println("totalMemory : " + Runtime.getRuntime().totalMemory());
		System.out.println("freeMemory : " + Runtime.getRuntime().freeMemory());
		System.out.println("NumberOfAvailableProcessors : " + Runtime.getRuntime().availableProcessors());
		Runtime.getRuntime().gc();
		
	}
}
