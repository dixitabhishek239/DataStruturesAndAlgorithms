package SortingAlgorithms;

import java.util.Scanner;

public class Sorting {

	public static void main(String args[]) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("SORTING ALGORITHMS : ");
		
		
		System.out.print("Enter the size of an array - ");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Enter the elements of an Array - ");
		for(int i=0; i<size; i++) {
			array[i] = scanner.nextInt();
		}
				
//		SelectionSort selectionSort = new SelectionSort(size, array);
//		selectionSort.SelectionSortAlgorithm();
		
//		BubbleSort bubbleSort = new BubbleSort(size, array);
//		bubbleSort.BubbleSortAlgorithm();
		
		InsertionSort insertionSort = new InsertionSort(size, array);
		insertionSort.InsertionSort();
		
	}
	
}
