package SortingAlgorithms;

public class SelectionSort {

	int size;
	int[] array;
	
	SelectionSort(int size, int[] array){
		this.size = size;
		this.array = array;
	}
	
	public void SelectionSortAlgorithm(){
		
		System.out.println("Selection Sort - ");
		System.out.println("------------------");
		
		int temp = 0;
		
		for(int i=0; i<size-1; i++) {
			for(int j=i+1; j<size; j++) {
				if(array[i]>=array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array : ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+"  ");
		}
	}
	
}
