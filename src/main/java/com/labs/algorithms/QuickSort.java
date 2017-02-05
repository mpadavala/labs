package com.labs.algorithms;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] array) {
		doQuickSort(array, 0, array.length - 1);
	}
	
	public static void doQuickSort(int[] array, int startIndex, int endIndex) {
		
		int pivot = pivot(array, startIndex, endIndex);
		
		if (startIndex < pivot - 1) {
			doQuickSort(array, startIndex, pivot - 1);
		}
		if (endIndex > pivot) {
			doQuickSort(array, pivot, endIndex);
		}
	}

	public static int pivot(int[] array, int left, int right) {
		
		int tempIndex = (right-left)/2;
		
		if(tempIndex > left && tempIndex <right){
			
		}
		
		
		System.out.println("pivot : " + left);
		return left;
	}

	public static void main(String args[]) {
		int[] input = { 23, 31, 1, 21, 36, 72 };
		System.out.println("Before sorting : " + Arrays.toString(input));
		quickSort(input); 
		System.out.println("After sorting : " + Arrays.toString(input)); 
		
		int[] withDuplicates = { 11, 14, 16, 12, 11, 15 };
		System.out.println("Before sorting : " + Arrays.toString(withDuplicates));
		quickSort(withDuplicates); 
		System.out.println("After sorting : " + Arrays.toString(withDuplicates));
	}
}
