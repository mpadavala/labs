package com.labs.annotations;

import java.lang.reflect.Method;

public class ProcessAnnotations {

	public static void main(String[] args) {
		
		Class<AnnotationExample> clazz = AnnotationExample.class;

		//Process the class level Annotation
		if(clazz.isAnnotationPresent(TesterInfo.class)){
			TesterInfo annotation = clazz.getAnnotation(TesterInfo.class);
			
			System.out.println("Created By : " + annotation.createdBy());
			System.out.println("Last Modfied By : " + annotation.lastModifiedBy());
			
			System.out.println("Priority : " + annotation.priority());
			
			String[] tags =  annotation.tags();
			
			if(tags != null){
				System.out.print("Tags : ");
				for(String tag : tags){
					System.out.print(tag + ", ");
				}
				System.out.println("");
			}
			
		}
		
		//Process MethodLevel Annotation
		Method[] methods = clazz.getDeclaredMethods();
		
		if(methods != null){
			for(Method method : methods){
				MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
				if(methodAnnotation != null){
					System.out.println(methodAnnotation + " is enalbeld on Method : "  + method.getName());
					//TODO:: you can invoke methods also
				}
				
			}
			
		}
	
		
		
	}
}
