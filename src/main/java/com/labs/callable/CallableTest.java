package com.labs.callable;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.springframework.util.StopWatch;

public class CallableTest {

	private static final int FIVE_THOUSAND = 5000;

	public static void main(String[] args) {
	
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
	    Collection<Callable<String>>callables = new HashSet<Callable<String>>();
	    callables.add(new TaskOne());
	    callables.add(new TaskTwo());
	    
	    List<Future<String>> futures;
		try {
			StopWatch stopWatch = new StopWatch();
			stopWatch.start();
			futures = executor.invokeAll(callables);
			
			for(Future<String>future : futures) {
				System.out.println(future.get());
			} 
			stopWatch.stop();
			System.out.println("Time Taken for Finishig all the jobs : " + stopWatch);
			
			System.out.println("Main Thread Sleeping for " +  FIVE_THOUSAND +  " milli seconds");
			Thread.sleep(FIVE_THOUSAND);;
			
			System.out.println("Executor Threadpool is shutdown");
		}catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
		}finally{
			executor.shutdown();
		}
    }
}