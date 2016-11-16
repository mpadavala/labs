package com.labs.uuid;

import java.util.UUID;

public class UUIDGenerator {

	public static String generateUUID(){
		return UUID.randomUUID().toString();
	}
	
	public static void main(String[] args){
		System.out.println("random number : " + generateUUID());
	}
}
