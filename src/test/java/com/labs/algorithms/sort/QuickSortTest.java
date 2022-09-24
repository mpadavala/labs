package com.labs.algorithms.sort;

import java.util.Arrays;

import org.junit.Test;

import com.labs.algorithms.sort.QuickSort;

public class QuickSortTest {
	
	QuickSort quickSort = new QuickSort();
	
	@Test
	public void sortTest() {
		
		int[] input = { 23, 2, 31, 1, 21, 36, 72 };
		System.out.println("Before sorting : " + Arrays.toString(input));
		quickSort.sort(input); 
		System.out.println("After sorting : " + Arrays.toString(input)); 
		
		int[] withDuplicates = { 11, 14, 16, 12, 11, 15 };
		System.out.println("Before sorting : " + Arrays.toString(withDuplicates));
		quickSort.sort(withDuplicates); 
		System.out.println("After sorting : " + Arrays.toString(withDuplicates));
	}

}
