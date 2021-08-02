package other;

import java.util.ArrayList;

public class BitBinaryCode {

	public static void main(String args[]) {
		
		int[] a = {1,2,3,4,5};
		
		ArrayList<String> ans = new ArrayList<>();
		
		for(int i=0; i<a.length; i++) {
			
			String data = DecimalToBinary(a[i]);
			ans.add(data);
			
		}
		
		for(int i=0; i<a.length; i++) {
			
		}
	}
	
	public static String DecimalToBinary(int n) {
		
		int number = n;
		int quotient = 0;
		int reminder = 0;
		ArrayList<Integer> answer = new ArrayList<Integer>(); 
		
		
		do {
			
			quotient = number/2;
			reminder = number%2;
			number = quotient;
					
			answer.add(reminder);
			
		}while(quotient!=0);
		
//		for(int i=0; i<answer.size(); i++) {
//			System.out.print(answer.get(answer.size()-i-1));
//		}
		
		return answer.toString();

	}
	
}
