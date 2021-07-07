package BasicLogicalQuestions;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = scanner.nextInt();
		int factorial = factorial(number);
		System.out.println("Factorial is "+factorial);
	}
	
	public static int factorial(int number) {
		
		int factorial = 1;
//		System.out.println("Number : "+number);
		for(int i=number; i>=1; i--) {
			factorial *= i;
		}
	
		return factorial;
	}
}
