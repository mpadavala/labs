package com.labs;

import java.util.Random;

/*
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
 *
 */
public class MatrixZeroRowsAndColumns {
	
	public static void main(String args[]){
		makeRowsAndColumnsZero(10,5,1);
	}
	
	public static void makeRowsAndColumnsZero(int numRows, int numColumns, int numZeros){
		
		int[][] matrix = populateMatrix(numRows, numColumns);
		printMatrix(matrix);
		populateSomeZeros(matrix, numZeros);
		printMatrix(matrix);
		makeRowsAndColumnsZeros(matrix);
		printMatrix(matrix);
		
	}
	
	public static int[][] populateMatrix(int numRows, int numColumns){
		int[][] matrix = new int[numRows][numColumns];
		
		Random random = new Random();
		
		for(int i=0; i<numRows; i++){
			for(int j=0; j<numColumns; j++){
				matrix[i][j] = random.nextInt(100) + 1;
			}
		}
		
		return matrix;
	}
	

	public static void populateSomeZeros(int[][] matrix, int numZeros){
		
		Random random = new Random();
		int numberOfZeros = random.nextInt(numZeros) + 1;
		Random randomForRows = new Random();
		Random randomForColumns = new Random();
		System.out.println("Number Of Zeros Populating : " + numberOfZeros);
		for(int i=0; i<numberOfZeros; i++){
			matrix[randomForRows.nextInt(matrix.length)][randomForColumns.nextInt(matrix[0].length)]=0;
		}
	}
	
	public static void makeRowsAndColumnsZeros(int[][] matrix){
		
		int[] rows = new int[matrix.length];
		int[] columns = new int[matrix[0].length];
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j] == 0){
					rows[i] = 1;
					columns[j] = 1;
				}
			}
		}
		System.out.println("Rows to make zero...");
		printArray(rows);
		System.out.println("Columns to make zero...");
		printArray(columns);
		System.out.println("");
		
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(rows[i] == 1 || columns[j] == 1){
					matrix[i][j]=0;
				}
			}
		}
		
	}
	
	public static void printArray(int[] input){
		for(int i=0; i<input.length; i++){
			System.out.print(input[i]);
			System.out.print("  ");
		}
		System.out.println("");
	}
	public static void printMatrix(int[][] matrix){
		
		int numRows = matrix.length;
		int numColumns = matrix[0].length;
		
		for(int i=0; i<numRows; i++){
			for(int j=0; j<numColumns; j++){
				System.out.print(matrix[i][j]);
				System.out.print("  ");
			}
			System.out.println("");
		}
		System.out.println("");
	}

}
