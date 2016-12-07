package com.labs;

/*
Assume you have a method isSubstring which checks if one word is a substring of another. 
Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one
call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
 */
public class StringRotationSubString {

	public static void main(String args[]){
		
		String originalString = "waterbottle";
		String testString = "erbottlewat";
		
		String tempString = testString + testString;
		boolean result = isSubString(tempString, originalString);
		
		if(result){
			System.out.println("\"" + testString + "\" is rotation of \"" +  originalString + "\"");
		}else{
			System.out.println("\"" + testString + "\" is NOT rotation of \"" +  originalString + "\"");
		}
		
		
	}
	public static boolean isSubString(String originalString, String subString){
		if(originalString != null && subString != null){
			return originalString.contains(subString);
		}
		return false;
	}
}
