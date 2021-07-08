package Convertions;

import java.util.ArrayList;

public class DecimalToBinary {
	
	Integer decimalNumber;
	String binaryNumber;

	public DecimalToBinary(int decimalNumber) {

		this.decimalNumber = decimalNumber;
		
		int number = this.decimalNumber;
		int quotient = 0;
		int reminder = 0;
		ArrayList<Integer> answer = new ArrayList<Integer>(); 
		
		
		do {
			
			quotient = number/2;
			reminder = number%2;
			number = quotient;
			
//			System.out.print(number+ "  " + quotient + "  " + reminder);
			
			answer.add(reminder);
			
		}while(quotient!=0);
		
		for(int i=0; i<answer.size(); i++) {
			System.out.print(answer.get(answer.size()-i-1));
		}
		
	}

	
	
}
