package AdvanceFunctionQuestions;

import java.util.Scanner;

public class AddTwoBinaryNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adding Two Binary Numbers");
		System.out.print("Number 1 - ");
		Integer number1 = scanner.nextInt();
		System.out.print("Number 2 - ");
		Integer number2 = scanner.nextInt();
		
		 addBinary(number1,number2);
		
	}

	public static void addBinary(Integer a, Integer b) {
		
		int ans = 0;
		int carry = 0;
		
		while(a>0 && b>0) {
			
			if(a%2==0 && b%2==0) {
				ans = ans*10 + carry;
				carry = 0;
			}
			else if((a%2==1 && b%2==0) || (a%2==0 && b%2==1)) {
				if(carry==1) {
					ans = ans*10 + 0;
					carry = 1;
				}else {
					ans = ans*10 + 1;
					carry = 0;
				}
			}
			else {
				
				ans = ans*10 + carry;
				System.out.println(ans);
				carry = 1;
			}
			a/=10;
			b/=10;
			
		}
		
		while(a>0) {
			
			if(carry==1) {
				if(a%2==1) {
					ans = ans*10 + 0;
					carry = 1;

				}else {
					ans = ans*10 + 1;
					carry = 0;
				}
			}
			else {
				ans = ans*10 + (a%2);
			}
			a/=10;
		}

		while(b>0) {
			
			if(carry==1) {
				if(b%2==1) {
					ans = ans*10 + 0;
					carry = 1;

				}else {
					ans = ans*10 + 1;
					carry = 0;
				}
			}
			else {
				ans = ans*10 + (b%2);
			}
			b/=10;
		}
		
		if(carry==1) {
			ans = ans*10 + 1;
		}

		int finalAnswer = reverseInt(ans);
		
		System.out.println("Total - "+finalAnswer);
		
	}
	
	public static int reverseInt(int n1) {
		
		int n = 0;
		
		while(n1>0) {
			
			int lastDigit = n1%10;
			n = n*10 + lastDigit;
			n1/=10;
		}
		
		return n;
	}
	
}
