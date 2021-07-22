package ArrayChallenge;

import java.util.Scanner;

/*
 * Problem:

Isyana is given the number of visitors at her local theme park on N consecutive days. 
The number of visitors on the i-th day is V. 
A day is record breaking if it satisfies both of the following conditions:

The number of visitors on the day is strictly larger than 
the number of visitors on each of the previous days.

Either it is the last day, or the number of visitors on the day is 
strictly larger than the number of visitors on the following day.

Note that the very first day could be a record breaking day!

Please help Isyana find out the number of record breaking days.
 * 
 * */

public class RecordBreaker {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Enter the array size : ");
		int size = scanner.nextInt();
		
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i] = scanner.nextInt();
		}
		
		int pr = a[0];
		int cr = a[1];
		int ans = a[0];
		int count = 0;
		for(int i=1; i<size-1; i++) {
			if(a[i]>=a[i-1]) {
				if(a[i] > ans && a[i] > a[i+1]) {
					ans = a[i];
					count ++;
				}
				if(a[i+1] >  a[i] && i==size-2) {
					ans = a[i+1];
					count ++;
				}
			}
		}
		
		System.out.println(ans +"   "+ count);
	}
	
}
