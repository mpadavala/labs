package com.labs.algorithms;

public class IntegerOperations {

	  public int reverse(int x) {
	        boolean isNegative = false;
	        int input = x;
	        if(input < 0){
	            isNegative = true;
	            input = -1*x;
	        }
	        
	        int length = (Integer.toString(input)).length();
	        
	        int output = 0;
	        for(int i=1; i<=length; i++){
	            output = output*(int)(Math.pow(10, length-i)) + (input%10);
	            input = (input-output)/10;           
	        }
	     
	        if(isNegative){
	            output = -1*output;
	        }   
	        return output;
	    }
	  
}
