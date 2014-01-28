package com.padavala.labs.diagnostics;

import java.util.concurrent.Callable;

public class SubTask implements Callable<Void>{
	
	public SubTask() {
	}

	public void execute() {
		DiagnosticLogging.addDiag("Subtask - execute");
	}

	public Void call() throws Exception {
		execute();
		return null;
	}
}
