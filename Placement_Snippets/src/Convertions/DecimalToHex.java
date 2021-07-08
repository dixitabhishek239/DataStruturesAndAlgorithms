package Convertions;

import java.util.ArrayList;

public class DecimalToHex {

	Integer decimalNumber;
	String hexNumber;

	public DecimalToHex(int decimalNumber) {

		this.decimalNumber = decimalNumber;
		
		int number = this.decimalNumber;
		int quotient = 0;
		Integer reminder = 0;
		ArrayList<String> answer = new ArrayList<String>(); 
		
		
		do {
			
			quotient = number/16;
			reminder = number%16;
			number = quotient;
			
			if(reminder==10) {
				answer.add("A");
			}else if(reminder==11){
				answer.add("B");
			}else if(reminder==12){
				answer.add("C");
			}else if(reminder==13){
				answer.add("D");
			}else if(reminder==14){
				answer.add("E");
			}else if(reminder==15){
				answer.add("F");
			}else {
				answer.add(reminder.toString());
			}

//			answer.add(reminder);
			
		}while(quotient!=0);
		
		for(int i=0; i<answer.size(); i++) {
			System.out.print(answer.get(answer.size()-i-1));
		}
		
	}
	
}
