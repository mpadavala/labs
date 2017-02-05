package com.labs.innerclasses;

public class OuterInnerClassObjects {
	
	public static void main(String args[]){
		
		OuterClass outerClass = new OuterClass();
		
		OuterClass.InnerClassPublic innerClassPublic1 = new OuterClass().new InnerClassPublic();
		// or
		OuterClass.InnerClassPublic innerClassPublic2 = outerClass.new InnerClassPublic();
		
		
	}

}
