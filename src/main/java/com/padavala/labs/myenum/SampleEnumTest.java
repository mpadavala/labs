package com.padavala.labs.myenum;

public class SampleEnumTest {
	
	public static void main(String[] args){
		
		SampleEnum sampleEnum = SampleEnum.get("one");
		System.out.println("Name : "+sampleEnum.getName());
		System.out.println("Value : "+sampleEnum.getValue());
	}

}
