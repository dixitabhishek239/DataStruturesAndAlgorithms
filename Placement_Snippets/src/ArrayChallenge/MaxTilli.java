package ArrayChallenge;

import java.util.Scanner;

/*
 * PROBLEM STATEMENT : 
 * 
 * Given an Array a[] of size n.
 * For each i from 0 n-1
 * Output the max(a[0], a[1], ..., a[i])..
 * 
 * */

/*
 * Time Complexity : O(n)
 * 
 * */

public class MaxTilli {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of an array : ");
		int size = scanner.nextInt();
		
		System.out.println("Enter the elements of an Array : ");
		int[] a = new int[size];
		
		for(int i=0; i<size; i++) {
			a[i] = scanner.nextInt();
		}
		
//		for(int i=0 ; i<size; i++) {
//			System.out.println(a[i]);
//		}
		
		MaxTilliCalculator(a, size);
		
	}

	public static void MaxTilliCalculator(int[] a, int size) {
		
		int maxbit = a[0];
		int[] result = new int[size]; 
		
		for(int i=0; i<size; i++) {
			if(maxbit >= a[i]) {
				result[i] = maxbit;
			}
			else {
				result[i] = a[i];
				maxbit = a[i];
			}
		}
		
		for(int i=0; i<size; i++) {
			System.out.println(result[i]);
		}
		
	}
	
}
