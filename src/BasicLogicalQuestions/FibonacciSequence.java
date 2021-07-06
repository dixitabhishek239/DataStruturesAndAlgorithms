package BasicLogicalQuestions;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String args[]) {
		
		System.out.println("Enter the number of terms : ");
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		
		int term1=0;
		int term2=1;
		int nextTerm;
		
		for(int i=0; i<count; i++) {
			
			System.out.println(term1);
			nextTerm = term1 + term2;
			term1 = term2;
			term2 = nextTerm;

		}
		
	}
	
}
