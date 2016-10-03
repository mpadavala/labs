package com.labs.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class MyExecutor {

	private ExecutorService executorService = Executors.newCachedThreadPool();
	
	
	public static void main(String a[]){
		MyExecutor myExecutor = new MyExecutor();
		myExecutor.execute();
		System.out.println("Execution is done!!");
		myExecutor.execute();
	}
	
	private void execute(){
		Callable<String> callableTask = getCallableTask();
		Future<String> future = executorService.submit(callableTask);
		
	
		try {
			String str = future.get(1000, TimeUnit.SECONDS);
			System.out.println(str);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private Callable<String> getCallableTask() {
		
		Callable<String> task = new Callable<String>() {
			public String call() {
				return "Hi";
			}
		};
		return task;
			
	}
}
