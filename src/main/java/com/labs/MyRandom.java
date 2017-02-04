package com.labs;

import java.util.Random;

public class MyRandom {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i=0; i<10; i++){
			int number = random.nextInt(999999 - 100000+1)+100000;
			System.out.println(number);
		}
		
	}
}
