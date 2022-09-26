package com.labs.algorithms.matrix;

public class MatrixOperations {

	/*
	 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
	 * write a method to rotate the image by 90 degrees Can you do this in place?
	 */
	
	public  void rotateMatrix(int[][] matrix, int rank) {
		//for(int layer=0; layer<rank/2; ++layer) {
		//}
	}
	
	
	/**
	 * Write an algorithm such that if an element in an MxN is 0, its entire row and column is set to 0
	 * 
	 */
	
	public int[][] setZeros(int[][] matrix) {
		
		int rows[] = new int[matrix.length];
		int columns[] = new int[matrix.length];
		
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j< matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					rows[i] = 1;
					columns[j] = 1;
				}
			}
		}
		
		for(int i=0; i < matrix.length; i++) {
			for(int j=0; j< matrix[0].length; j++) {
				if(rows[i] == 1 || columns[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}
	
	
	public boolean areSameMatrix(int[][]first, int[][]second) {
		
		if(first.length != second.length) return false;
		if(first[0].length != second[0].length) return false;

		for(int i=0; i < first.length; i++) {
			for(int j=0; j< first[0].length; j++) {
				if(first[i][j] != second[i][j]) return false;
			}
				
		}
		return true;
	}

}
