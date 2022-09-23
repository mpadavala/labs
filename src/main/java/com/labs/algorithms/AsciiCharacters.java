package com.labs.algorithms;


/*
 * Implement  an algorithm to determine if a string has all unique Characters. What if you can't use additional data structures
 * 
 */
public class AsciiCharacters {
	
	
	public void printAsciiCharacters() {
		for(int i=0; i<256; i++) {
			System.out.println(i  + " : " + (char)i );
		}
	}
	
	public boolean isUniqCharSet(String str) {
		
		boolean[] charset = new boolean[256];
		
		for(int i=0; i<str.length(); i++) {
			int charValue = str.charAt(i);
			if(charset[charValue]) {
				return false;
			}else {
				charset[charValue] = true;
			}
		}
		return true;
	}

}
