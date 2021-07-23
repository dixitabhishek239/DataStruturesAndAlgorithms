package twoDimentionalArray;

public class MatrixMultiplication {

	public static void main(String args[]) {
	
		int[][] m1 = { {2,4,1,2}, {8,4,3,6}, {1,7,9,5}};
		int[][] m2 = { {1,2,3}, {4,5,6}, {7,8,9}, {4,5,6}};
		
		int[][] ans = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<4; k++) {
					ans[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(ans[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
}
