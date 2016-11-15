package com.labs.annotations;

import com.labs.annotations.TesterInfo.Priority;

@TesterInfo(createdBy="Murali", tags={"My test", "import"}, lastModifiedBy="Jan 1st, 2015", priority=Priority.MEDIUM)
public class AnnotationExample {

	@MyAnnotation
	public void testA() {
		System.out.println("TestA");
	}
	
	@MyAnnotation
	void testB() {
		System.out.println("TestB");
	}
	
	void testC() {
		System.out.println("TestC");
	}
	
}
