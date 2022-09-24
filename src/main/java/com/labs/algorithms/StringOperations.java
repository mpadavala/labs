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
	
	public String removeDuplicates(String str) {

		if(str == null) return str;
		char[] charArray = str.toCharArray();
		removeDuplicatesNoAdditionalBuffer(charArray);
		return String.valueOf(charArray);
	}
	
	public void removeDuplicatesNoAdditionalBuffer(char[] charArray) {
		
		if(charArray.length == 0) return;
		
		for(int i=0; i<charArray.length; i++) {
			for(int j=i+1; j<charArray.length; j++) {
				if(charArray[i]==charArray[j]) {
					charArray[j]= ' ';
				}
			}
		}
	}
	
	// Write a method to replace all spaces in a string with ‘%20’
	public String replaceSpaceWith(String str, String replaceWith) {
		
		if(str == null || replaceWith == null) return null;
		
		StringBuffer buffer = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				buffer.append(replaceWith);
			}else {
				buffer.append(String.valueOf(str.charAt(i)));
			}
		}
		return buffer.toString();
	}

}
