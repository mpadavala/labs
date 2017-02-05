package com.labs.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethods {

	public static <T> void add(T element, Collection<T> collection){
	    collection.add(element);
	}
	
	public static void printCollection(Collection<?> c) {
		for (Object e : c) {
			System.out.println(e);
		}
	}
	
	public static void main(String a[]){
		
		List<String> stringList = new ArrayList<String>();

		add("stringElement1", stringList);  
		add("stringElement2", stringList);  
		printCollection(stringList);
		
		
		List<Integer> integerList = new ArrayList<Integer>();
		add(123, integerList);  
		add(123, integerList);  
		printCollection(integerList);
		
	}
}
