package com.labs;

public class NotCallingFromMain {

	public static void main(String args[]) {

	}

	static {
		int[][] matrix = createMatrix(5, 10);
		printMatrix(matrix);
	}

	public static int[][] createMatrix(int numRows, int numColumns) {

		int[][] matrix = new int[numRows][numColumns];

		int number = 0;
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				matrix[i][j] = number++;
			}
		}
		return matrix;
	}

	public static void printMatrix(int[][] matrix) {

		int numRows = matrix.length;
		int numColumns = matrix[0].length;

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				System.out.print(matrix[i][j]);
				System.out.print("  ");
			}
			System.out.println("");
		}
	}

}
