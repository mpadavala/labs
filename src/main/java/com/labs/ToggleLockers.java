package com.labs;

public class ToggleLockers {
	
	private static int[] locker = new int[50];
	
	static{
		for(int i=0; i<locker.length; i++){
			locker[i]=0;
		}
		printArray(0);
	}
	
	public static void main(String[] args) {
		
		for(int i=0; i<locker.length; i++){
			unlock(i+1);
			printArray(i+1);
		}
	}
	
	public static void unlock(int counter){
		int position=counter;
		while(position<=locker.length){
			if(locker[position-1]==0){
				locker[position-1]=1;
			}else{
				locker[position-1]=0;
			}
			position = position+counter;
		}
	}
	
	public static void printArray(int counter){
		int numOpen=0;
		System.out.print(counter + " : ");
		for(int i=0; i<locker.length; i++){
			if(locker[i] == 1){
				numOpen++;
			}
			System.out.print(locker[i]);
		}
		System.out.print( " ----  " + numOpen);
		System.out.println("");
	}
}
