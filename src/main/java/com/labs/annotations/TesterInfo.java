package com.labs.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TesterInfo {

	public enum Priority{
		HIGH, MEDIUM, LOW
	}
	
	Priority priority() default Priority.HIGH;
	
	String[] tags();
	String createdBy();
	String lastModifiedBy();
	
}
