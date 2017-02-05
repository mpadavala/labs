package com.labs.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtil {

	public <T> List<T> convertToList(T[] array){
		
		List<T> list = new ArrayList<T>();
		for(int i=0; i< array.length; i++){
			list.add(array[i]);
		}
		return list;
	}
	
	public <T> void printList(List<T> list){
		for(T item : list){
			System.out.println(item.toString());
		}
	}
	
	public static void main(String a[]){
		Integer array[] = new Integer[100];
		for(int i=0; i<100; i++){
			array[i]=i;
		}
		
		ArrayUtil arrayUtil = new ArrayUtil();
		List<Integer> list = arrayUtil.convertToList(array);
		arrayUtil.printList(list);
	}
}
