package ArrayChallenge;

import java.util.Scanner;

/*
 * Problem Statement : 
 * Given an array a[] of size n.
 * Output sum of each Subarray of the given array. 
 * 
 * */

public class SumOfAllSubarrays {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of an array : ");
		int size = scanner.nextInt();

		int[] a = new int[size];
		System.out.println("Enter the elements of an array : ");
		for(int i=0; i<size; i++) {
			a[i] = scanner.nextInt();
		}
		
		SumOfAllSubarraysCalculator(a,size);
		
	}
	
	public static void SumOfAllSubarraysCalculator(int[] a, int size) {
				
		for(int i=0; i<size; i++) {
			
			int sum = 0;
			
			for(int j=i; j<size; j++) {
				sum += a[j];
				System.out.println(sum+"  ");
			}
			
		}
		
	}
	
}
