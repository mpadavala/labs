package com.padavala.labs.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable {

	private ExecutorService executorService = Executors.newCachedThreadPool();
	
	
	
	public Response execute(){
		
		String key = "key";
		
		Future<String> future = executorService.submit(new Callable<String>(){

			public String call() throws Exception {
				
					Thread.sleep(5000);
					return "Done Sleeping";
			}
		});
		return new Response(key, future);
		
	}

}
