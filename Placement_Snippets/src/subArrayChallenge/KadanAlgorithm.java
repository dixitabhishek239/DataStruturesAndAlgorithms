package subArrayChallenge;

import java.util.Scanner;

public class KadanAlgorithm {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i] = scanner.nextInt();
		}
		
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<size; i++) {
			currentSum += a[i];
			if(currentSum < 0) {
				currentSum = 0;
			}
			maxSum = Math.max(maxSum, currentSum);
		}
		System.out.println(maxSum);
		
	}
	
}
