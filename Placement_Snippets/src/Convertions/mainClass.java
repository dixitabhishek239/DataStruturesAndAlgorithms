package Convertions;

import java.util.Scanner;

public class mainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Number Converstion System");
		
		System.out.println("Binary to Decimal");
		System.out.print("Binary Number - ");
		int binaryNumber = scanner.nextInt();
		
		new BinaryToDecimal(binaryNumber);
		
	}

}