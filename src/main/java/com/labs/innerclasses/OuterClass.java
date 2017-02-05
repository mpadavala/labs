package com.labs.innerclasses;

public class OuterClass {
	
	private String name;
	private static final String STATIC_FINAL_STRING = "Static Final String";
	
	public String sayHi(){
		return "Hi " + name  + "!!";
	}

	public static String getStaticFinalString(){
		return STATIC_FINAL_STRING;
	}

	public void createInnerClasses(){
		
		InnerClassPublic innerClassPublic = new InnerClassPublic();
		
		InnerClassPrivate innerClassPrivate = new InnerClassPrivate();
		
		InnerClassProtected innerClassProtected = new InnerClassProtected();
		
		InnerClassPackage innerClassPackage = new InnerClassPackage();

				
	}
	
	public class InnerClassPublic{
		
	}
	
	private class InnerClassPrivate{
		
	}
	
	protected class InnerClassProtected{
		
	}
	
	class InnerClassPackage{
		
	}
}
