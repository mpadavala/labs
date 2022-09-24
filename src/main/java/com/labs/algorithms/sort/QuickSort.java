package com.labs.algorithms.sort;

public class QuickSort {

	public void sort(int[] array) {
		System.out.println("Number of Elements : " +  array.length);
		doQuickSort(array, 0, array.length - 1);
	}
	
	private void doQuickSort(int[] array, int low, int high) {
		
		if(low < high) {
			int pivot = partition(array, low, high);
			doQuickSort(array, low, pivot-1);
			doQuickSort(array, pivot+1, high);
		}
	}

	private int partition(int[] array, int begin, int end) {
		
		int pivotElement = array[end];
	    int i = (begin-1);

	    for (int j = begin; j <= end-1; j++) {
	        if (array[j] < pivotElement) {
	            i++;
	            swap(array, i, j);
	        }
	    }
	    swap(array, i+1, end);
	    return (i+1);	
	}
	
	private void swap(int[] array, int i, int j) {
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
