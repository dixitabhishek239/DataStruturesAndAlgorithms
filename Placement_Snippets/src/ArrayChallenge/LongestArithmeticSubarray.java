package ArrayChallenge;

import java.util.Scanner;

/*
 * Problem:

An arithmetic array is an array that contains at least two integers and 
the differences between consecutive integers are equal. 
For example, [9, 10], [3, 3, 3], and [9, 7, 5, 3] are arithmetic arrays, 
while [1, 3, 3, 7], [2, 1, 2], and [1, 2, 4] are not arithmetic arrays.

Sarasvati has an array of N non-negative integers. 
The i-th integer of the array is A. 
She wants to choose a contiguous arithmetic subarray from her array that has the maximum length. 
Please help her to determine the length of the longest contiguous arithmetic subarray.
 
 * 
 * */

public class LongestArithmeticSubarray {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i] = scanner.nextInt();
		}
		
//		for(int i=0; i<size; i++) {
//			System.out.println(a[i]+"  ");
//		}

		
		int pd = a[0] - a[1];
		int currentLenght = 2;
		int maxLength = 2;
		
		for(int i=1; i<size-1; i++) {
			if(pd == a[i]-a[i+1]) {
				currentLenght ++;
			}
			else {
				pd = a[i]-a[i+1];
				currentLenght = 2;
			}
			maxLength = Math.max(maxLength, currentLenght);
		}
		
		System.out.println(maxLength);
	}
	
}
