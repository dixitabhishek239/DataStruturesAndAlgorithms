package BasicLogicalQuestions;

import java.util.Scanner;
import BasicLogicalQuestions.CalculatenCr;

public class PascalsTriangle {

	public static void main(String args[]) {
		
		System.out.println("Pascals Triangle : ");
		System.out.print("Enter the side - ");
		Scanner scanner = new Scanner(System.in);
		int side = scanner.nextInt();
		
		pascalTriangleCalculator(side);
		
	}

	public static void pascalTriangleCalculator(int side) {
	
		for(int i=0; i<side; i++) {
		
			for(int j=0; j<=i; j++) {
				int n = FactorialOfNumber.factorial(i);
				int nr = FactorialOfNumber.factorial(i-j);
				int r =  FactorialOfNumber.factorial(j);

				int ans = CalculatenCr.ncrCalculator(n, nr, r);
				System.out.print(ans+" ");
			}
			System.out.println();
		}
		
	}
}
