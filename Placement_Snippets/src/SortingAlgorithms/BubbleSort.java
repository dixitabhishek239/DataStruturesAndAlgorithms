package SortingAlgorithms;

public class BubbleSort {

	int size;
	int[] array;
	
	BubbleSort(int size, int[] array){
		this.size = size;
		this.array = array;
	}
	
	public void BubbleSortAlgorithm() {
		
		System.out.println("Bubble Sort Algorithm : ");
		
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-i-1; j++) {
				if(array[j]>=array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array : ");
		for(int i=0; i<size; i++) {
			System.out.print(array[i]+"  ");
		}
		
	}
}
