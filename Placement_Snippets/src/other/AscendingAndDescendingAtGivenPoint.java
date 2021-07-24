package other;

import java.util.Arrays;

public class AscendingAndDescendingAtGivenPoint {

	public static void main(String args[]) {
		
		int[] a = {11,7,5,10,46,23,16,8};
		int key = 3;
		
		int[] a1 = new int[key];
		int[] a2 = new int[a.length-key];
		
		for(int i=0; i<key; i++) {
			a1[i] = a[i];
		}
		for(int i=0; i<a.length-key; i++) {
			a2[i] = a[i+key];
		}

		Arrays.sort(a1);
		Arrays.sort(a2);
		int counter = 0;
		for(int i=0; i<a.length; i++) {
			if(i<key) {
				a[i] = a1[i];
			}
			else {
				a[i] = a2[a.length-key-counter-1];
				counter++;
			}
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
