package com.labs;

/*
 * There are one hundred closed lockers in a hallway. A man begins by opening all one hundred lockers. 
 * Next, he closes every second locker. Then he goes to every third locker and closes it if it is open or 
 * opens it if it is closed (e.g., he toggles every third locker). After his one hundredth pass in the hallway, 
 * in which he toggles only locker number one hundred, how many lockers are open?
 */
public class ToggleLockers {
	
	public static void main(String[] args) {
		
		int[] locker = new int[50];
		
		for(int i=0; i<locker.length; i++){
			locker[i]=0;
		}
		
		ToggleLockers toggleLockers = new ToggleLockers();
		toggleLockers.printArray(locker, 0);
		
		for(int i=0; i<locker.length; i++){
			toggleLockers.unlock(locker,i+1);
			toggleLockers.printArray(locker, i+1);
		}	
	}
	
	public void unlock(int[] locker, int counter){
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
	
	public  void printArray(int[] locker, int counter){
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
