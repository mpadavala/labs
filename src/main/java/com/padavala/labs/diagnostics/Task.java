package com.padavala.labs.diagnostics;

import java.util.List;
import java.util.concurrent.Callable;

public class Task implements Callable<Void>{
	
	private final List<String> debugInfo;
	
	public Task() {
		debugInfo=DiagnosticLogging.getDebugInfo().get();
	}

	public void execute() {
		debugInfo.add("Task - execute");
	}

	public Void call() throws Exception {
		execute();
		return null;
	}
}
