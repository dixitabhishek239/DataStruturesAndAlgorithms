package SearchingAlgorithms;

import java.util.Scanner;

public class LinearSearchAlogrithm {

	public static void main(String args[]) {
		
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
		
		System.out.println(LinearSearch(array,size,element));
	}
	
	public static String LinearSearch(int[] array, int size, int element) {

		String ans = "";
		
		for(int i=0; i<size; i++) {
			
			if(array[i]==element) {
				System.out.println("array - "+array[i]+" == "+element);
				ans = "yes";
				break;
			}
			else {
				System.out.println("array - "+array[i]+" == "+element);
				ans = "no";
			}
		}
		return ans;
		
	}
}

