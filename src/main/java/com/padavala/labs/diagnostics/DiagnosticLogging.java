package com.padavala.labs.diagnostics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DiagnosticLogging {
	
	private static ExecutorService executorService = Executors.newFixedThreadPool(5);
	
	private static ThreadLocal<List<String>> debugInfo = new ThreadLocal<List<String>>();

	public static void addDiag(String key){
		debugInfo.get().add(key);
	}
	
	public static ThreadLocal<List<String>> getDebugInfo(){
		return debugInfo;
	}
	
	public static void main(String[] args){
		  
		debugInfo.set(new ArrayList<String>());
		addDiag("Main");
		 
		DiagnosticLogging main = new DiagnosticLogging();
		  main.execute();
		  
		  
		  Task task = new Task();
		  SubTask subTask = new SubTask();
		  
		  executorService.submit(task);
		  executorService.submit(subTask);
		 
		  System.out.println(debugInfo.get());
		 executorService.shutdown();
	}
	
	public void execute(){
		addDiag("Main - execute");
	}
	
	
}
