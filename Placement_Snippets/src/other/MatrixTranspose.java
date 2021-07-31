package other;

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String args[]) {
				
		int[][] matrix = { {1,2,3}, {4,5,6}, {7,8,9} };
		
		int[][] result = Transpose(matrix);
		
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				System.out.print(result[j][i]+"  ");
			}
			System.out.println();
		}
	}
	
	public static int[][] Transpose(int[][] matrix){
		
		int[][] matrix1 = matrix;
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix.length; j++) {
				matrix1[i][j] = 0;
				matrix1[i][j] = matrix[j][i];
			}
		}
		
		return matrix1;
	}
	
}
