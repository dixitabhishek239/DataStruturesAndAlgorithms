package AdvanceFunctionQuestions;

import java.util.Scanner;

public class SummationFirstNNaturalNo {

	public static void main(String[] args) {

		System.out.println("Summation of first N Natural Numbers : ");
		System.out.print("Number - ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		System.out.println("Summation = "+summation(number));
		
	}
	
	public static int summation(int number) {
		
		int sum = 0;
		
		for(int i=1; i<=number; i++) {
			sum += i;
		}
		
		return sum;
	}

}
