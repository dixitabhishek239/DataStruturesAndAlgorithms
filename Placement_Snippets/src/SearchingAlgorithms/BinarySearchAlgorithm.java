package SearchingAlgorithms;

import java.util.Scanner;

public class BinarySearchAlgorithm {

	public static void main (String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the Array : ");
		int size = scanner.nextInt();

		int[] array = new int[size];
		
		System.out.println("Enter the array : ");
		for(int i=0; i<size; i++) {
			int element = scanner.nextInt();
			array[i] = element;
		}
		
		System.out.println("Enter the element to be searched : ");
		int element = scanner.nextInt();
		
		System.out.println(BinarySearch(array,size,element));
	}
	
	public static int BinarySearch(int[] array, int size, int element) {
	

		int start = 0;
		int last = size-1;
		
		while(start<last) {
			int mid = (start+last)/2;
			if(array[mid]==element) {
				return mid;
			}
			else if(element>array[mid]){
				start = mid + 1;
			}
			else {
				last = mid - 1;
			}

		}
		
		return -1;
				
	}
	
}
