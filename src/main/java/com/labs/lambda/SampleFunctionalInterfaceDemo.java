package com.labs.lambda;

public class SampleFunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		//Traditional Implementation with Anonymous class
		/*
		carryOutWork(new SampleFunctionalInterface(){
			@Override
			public void doWork(){
				System.out.println("Doing Work!!");
			}	
		});
		*/
		carryOutWork(() -> System.out.println("Do Work on Lambda Expression Impl.."));
				 
	}
	
	public static void carryOutWork(SampleFunctionalInterface sfi){
	    sfi.doWork();
	}
}
