package subArrayChallenge;

import java.util.Scanner;

public class MaxSumOfCircularArray {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i] = scanner.nextInt();
		}
		
		int wrappedSum;
		int nonWrappedSum = KadanAlgorithm(a, size);
		
		int totalSum = 0;
		for(int i=0 ;i<size; i++) {
			totalSum += a[i];
			a[i] = -a[i];
		}

		wrappedSum = totalSum + KadanAlgorithm(a, size);
		

		System.out.println(Math.max(wrappedSum, nonWrappedSum));
	}

	public static int KadanAlgorithm(int[] a, int size) {
		
		int maxSum = Integer.MIN_VALUE;
		int currentSum = 0;
		
		for(int i=0 ;i<size; i++) {
			currentSum += a[i];
			if(currentSum < 0) {
				currentSum = 0;
			}
			maxSum = Integer.max(maxSum, currentSum);
		}
		
		return maxSum;
	
	}
}
