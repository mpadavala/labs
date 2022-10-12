package com.labs.algorithms;

import org.junit.Test;

public class LongestSubStringTest {

	LongestSubString longestSubString = new LongestSubString();
	
	@Test
	public void reverseTest() {
		System.out.println(longestSubString.lengthOfLongestSubstring("abcabcbb"));
		//assertEquals(integerOperations.reverse(123), 321);
	}

}
