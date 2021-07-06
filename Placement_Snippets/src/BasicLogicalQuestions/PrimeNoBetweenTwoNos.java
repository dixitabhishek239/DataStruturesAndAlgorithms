package BasicLogicalQuestions;

import java.util.Scanner;

public class PrimeNoBetweenTwoNos {

	public static void main(String args[]) {
		
		System.out.println("Enter two no.s");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
//		System.out.println("Num1 = "+num1);
//		System.out.println("Num2 = "+num2);
		
		findPrimeNumbers(num1,num2);
		
	}
	
	public static void findPrimeNumbers(int num1, int num2) {
	
		System.out.println("Prime Numbers : ");

		for(int i=num1; i<=num2; i++) {			
			int primeCounter = 0;
			int counter = 1;
			while(counter<=i) {				
				if(i%counter==0) {
					primeCounter++;
				}				
				counter++;
			}
			if(primeCounter<3) {
				System.out.println(i);
			}			
		}		
	}
}
