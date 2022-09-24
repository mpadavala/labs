package com.labs.algorithms;

public class StringOperations {

	public String reverseString(String str) {
		
		if(str == null) return null;
		
		char[] charArray = str.toCharArray();
		
		int startPointer = 0;
		int endPointer = charArray.length-1;
		char start;
		
		while(startPointer < endPointer) {
			start = charArray[startPointer];
			charArray[startPointer] = charArray[endPointer];
			charArray[endPointer]=start;
			startPointer++;
			endPointer--;
		}
		return String.valueOf(charArray);
	}
}
