package com.labs.algorithms.sort;

import java.util.Arrays;

public class MergeSort {
	
	
	public static int[] mergesort(int[] list){
		
		if(list.length <=1){
			return list;
		}
		int middle = list.length/2;
		int left[] = mergesort(Arrays.copyOfRange(list, 0, middle));
		int right[] = mergesort(Arrays.copyOfRange(list, middle, list.length));
		return mergeArrays(left, right);
	}

	public static int[] mergeArrays(int left[], int right[]){
		
		int size = left.length + right.length;
		int result[]  = new int[size];
		
			
		for(int i=0, j=0, z=0 ; i+j< size ; z++){
			
			if(j>=right.length){
				result[z] = left[i++];
			}
			else if(i>=left.length){
				result[z] = right[j++];
			}
			else if(left[i]<right[j] ){
				result[z] = left[i++];
			}else{
				result[z] = right[j++];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		testMergeArrays();
		testMergeSort();
	}

	private static void testMergeSort() {
		int list[] = new int[]{2,3, 5, 1, 3, 4, 4, 5};
		System.out.println("Sorting Arrays");
		print(list);
		print(mergesort(list));
	}
	
	private static void testMergeArrays() {
		int left[] = new int[]{2,3,5};
		int right[] = new int[]{1, 3, 4, 4, 5};
		
		System.out.println("Merging Arrays");
		print(left);
		print(right);
		print(mergeArrays(left,right));
		
	}
	
	public static void print(int[] list){
		for(int i : list){
			System.out.print(i + " , ");
		}
		System.out.println("");
	}
	
}
