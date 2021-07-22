package subArrayChallenge;

import java.util.Scanner;

public class MaxSubArraySum {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i] = scanner.nextInt();
		}
		
		int[] newa = new int[size];
		newa[0] = a[0];
		for(int i=1; i<size; i++) {
			newa[i] = a[i] + newa[i-1];
		}
				
		int maxSum = Integer.MIN_VALUE;
		for(int i=1; i<size; i++) {
			int sum = 0;
			for(int j=0; j<size; j++) {
				sum = newa[i] - newa[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		System.out.println(maxSum);
		
	}
	
}
