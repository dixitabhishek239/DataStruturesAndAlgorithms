package Convertions;

import java.util.Scanner;

public class mainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Number Converstion System");
		
//		System.out.println("Binary to Decimal");
//		System.out.print("Binary Number - ");
//		int binaryNumber = scanner.nextInt();
//		new BinaryToDecimal(binaryNumber);
		
//		System.out.println("Octal to Decimal");
//		System.out.print("Octal Number - ");
//		int octalNumber = scanner.nextInt();
//		new OctalToDecimal(octalNumber);
		
		System.out.println("Hex to Decimal");
		System.out.print("Hex Number - ");
		String hexNumber = scanner.nextLine();
		new HexToDecimal(hexNumber);

	
//		System.out.println("Decimal to Binary");
//		System.out.print("Decimal Number - ");
//		int decimalNumber = scanner.nextInt();
//		new DecimalToBinary(decimalNumber);


	}

}
