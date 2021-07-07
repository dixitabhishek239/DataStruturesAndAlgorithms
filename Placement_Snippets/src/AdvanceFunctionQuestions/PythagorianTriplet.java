package AdvanceFunctionQuestions;

import java.util.Scanner;

public class PythagorianTriplet {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Triplet - ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		pytharoianTriplet(a,b,c);
		
	}
	
	public static void pytharoianTriplet(int a,int b,int c) {
		
		int maxSide = Math.max(a, Math.max(b,c));
		int side1, side2;
		
		if(maxSide == a) {
			side1 = b;
			side2 = c;
		}else if(maxSide == b){
			side1 = a;
			side2 = c;
		}else {
			side1 = a;
			side2 = b;
		}
		
		if(maxSide*maxSide == side1*side1 + side2*side2) {
			System.out.println("Is a Pythagorian Triplet");
		}
		else {
			System.out.println("Not a Pythagorian Triplet");
		}
	}
	
}
