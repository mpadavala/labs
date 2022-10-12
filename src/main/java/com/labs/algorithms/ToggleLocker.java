package com.labs.algorithms;


/**
 * /*
 * There are one hundred closed lockers in a hallway. A man begins by opening all one hundred lockers. 
 * Next, he closes every second locker. Then he goes to every third locker and closes it if it is open or 
 * opens it if it is closed (e.g., he toggles every third locker). After his one hundredth pass in the hallway, 
 * in which he toggles only locker number one hundred, how many lockers are open?
 */

public class ToggleLocker {
	
	public void toggle(int numLockers) {
		
		int locker[] = new int[numLockers];
		
		//printLockers(locker);
		
		for(int i=1; i<=numLockers; i++) {
			for(int j=1; i*j<=numLockers; j++) {
				if(locker[i*j-1] == 0) locker[i*j-1]=1;
				else locker[i*j-1]=0;
			}
			//System.out.print(i + " :: ");
			//printLockers(locker);
		}
		
		printLockers(locker, true);
		
		
	}
	
	private void printLockers(int[] lockers, boolean count){
		int counter = 0;
		for(int i=0; i<lockers.length ; i++) {
			if(lockers[i] == 1) counter++;
			System.out.print(i+1 + "=" + lockers[i] +"; ");
		}
		System.out.println("");
		
		if(count) System.out.println("Locks Open : " + counter);
	}
	
	private void printLockers(int[] locker){
		printLockers(locker, false);
	}
	
}
