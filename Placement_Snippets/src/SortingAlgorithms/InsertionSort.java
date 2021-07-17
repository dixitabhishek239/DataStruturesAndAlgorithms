package SortingAlgorithms;

public class InsertionSort {

	int size;
	int[] array;
	
	InsertionSort(int size, int[] array){
		this.size = size;
		this.array = array;
	}
	
	public void InsertionSort() {
		
		System.out.println("Insertion Sort Algorithm : ");
		
		for(int i=1; i<size; i++) {
			int current = array[i];
			int j = i-1;
			while(j>=0 && array[j]>current) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = current;
		}
				
		System.out.println("Sorted Array : ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+"  ");
		}
		
	}
	
}
