package com.padavala.labs.callable;

import java.util.concurrent.ExecutionException;

public class MyMain {
	
	public static void main(String ar[]){
		
		MyMain mycallable = new MyMain();
		mycallable.test();
		
	}
	

	public void test(){
		MyCallable mycallable = new MyCallable();
		
		Response response = mycallable.execute();
		System.out.println(response.getKey());
		
		
		try {
			System.out.println(response.getFuture().get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done in main method!!");
		
	}
}
