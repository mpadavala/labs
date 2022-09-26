package com.labs.algorithms.matrix;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MatrixOperationsTest {

	
		
	MatrixOperations matrixOperations = new MatrixOperations();
		
		@Test
		public void setZerosTest() {
			
			int[][] matrix = {{ 1, 2, 0}, {4,0,6}, {7,8,9} };
			
			int[][] clonedMatrix = matrix.clone();
			int[][] returnMatrix = matrixOperations.setZeros(clonedMatrix);
			
			for(int i=0; i<returnMatrix.length; i++) {
				for(int j=0; j<returnMatrix[0].length; j++) {
					System.out.print(returnMatrix[i][j]);
					System.out.print(",");
				}
				System.out.println();
			}
			
			System.out.println(matrix);
			System.out.println(clonedMatrix);
			System.out.println(returnMatrix);
			
			
			
			//assertTrue(matrixOperations.areSameMatrix(matrix, returnMatrix));
			
		}
		

		
		
}
