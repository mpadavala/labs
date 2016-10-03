package com.labs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MyLinkedHashMap {

	public static void main(String[] args){
		test();
		test2();
	}

	private static void test(){
		
		Map<String,String> linkedHashMap = new HashMap<String, String>();
		
		linkedHashMap.put("key1", "value1");
		linkedHashMap.put("key2", "value2");
		linkedHashMap.put("key3", "value3");
		
		Set<String> keys = linkedHashMap.keySet();
        for(String k:keys){
            System.out.println(k+" -- "+linkedHashMap.get(k));
        }
		
	}
	
	
	
	private static void test2(){
		
		Map<String,String> linkedHashMap = new LinkedHashMap<String, String>();
		
		linkedHashMap.put("key1", "value1");
		linkedHashMap.put("key2", "value2");
		linkedHashMap.put("key3", "value3");
		
		Set<String> keys = linkedHashMap.keySet();
        for(String k:keys){
            System.out.println(k+" -- "+linkedHashMap.get(k));
        }
		
	}
}
