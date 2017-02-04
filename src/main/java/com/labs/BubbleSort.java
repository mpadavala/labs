package com.labs;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] input = {3, 5, 1, 2, 9, 0};
		print(input);
		bubbleSort(input);
	}
	
	public static void bubbleSort(int[] input){
		
		
	}
	
	public static void print(int[] input){
		for(int i=0; i<input.length ; i++){
			System.out.print(input[i] + ", ");
		}
		System.out.println("");
	}

}
