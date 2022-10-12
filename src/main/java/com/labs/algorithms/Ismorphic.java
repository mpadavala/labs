package com.labs.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true
 */


public class Ismorphic {
	
	public boolean isIsomorphic(String s, String t) {
		
	    if(s.length() != t.length()) return false;
	    
	    Map<Character, Character> map1 = new HashMap<Character, Character>();
	    Map<Character, Character> map2 = new HashMap<Character, Character>();   
	        
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    
	    for(int i=0; i<s.length(); i++) {
	    	char char1 = str1[i];
	    	char char2 = str2[i];
	    	
	    	if(map1.get(char1)==null && map2.get(char2)== null) {
	    		map1.put(char1,  char2);
	    		map2.put(char2,  char1);
	    	}else if((map1.get(char1)!=null) || (map2.get(char2) != null)) {
	    		if(map1.get(char1) != char2 || map2.get(char2) != char1 ) {
	    			return false;
	    		}
	    	}
	    }
	    return true;
	}

	
}
