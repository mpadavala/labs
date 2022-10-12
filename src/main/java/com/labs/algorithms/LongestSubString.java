package com.labs.algorithms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

	public int lengthOfLongestSubstring(String s) {
		Integer[] chars = new Integer[128];

		int left = 0;
		int right = 0;

		int res = 0;
		while (right < s.length()) {
			char r = s.charAt(right);

			Integer index = chars[r];
			if (index != null && index >= left && index < right) {
				left = index + 1;
			}

			res = Math.max(res, right - left + 1);

			chars[r] = right;
			right++;
		}

		return res;
	}
	
	
	
	public int lengthOfLongestSubstring2(String s) {
		Integer[] chars = new Integer[128];

		int left = 0, right = 0;

		Set<String> set = new HashSet<String>();
		
		int res = 0;
		while (right < s.length() && left <=right) {
			char r = s.charAt(right);

			Integer index = chars[r];
			if (index != null && index >= left && index < right) {
				left = index + 1;
			}

			res = Math.max(res, right - left + 1);

			chars[r] = right;
			right++;
		}

		return res;
	}
	
	
}
