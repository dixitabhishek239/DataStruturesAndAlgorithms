package ArrayChallenge;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i] = scanner.nextInt();
		}
		int count=0;
		HashMap<Integer, Integer> data = new HashMap<Integer,Integer>();
		for(int i=0; i<size; i++) {
			count=0;
			for(int j=0; j<size; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			data.put(i, count);
		}
		int max = (int) data.values().toArray()[0];
		for(Integer i: data.values()) {
			if(max<i) {
				max = i;
			}
		}
		System.out.println(getKey(data, max));
		
		// how to access the key of the given value
		
//		int n = (int) 1e6;
//		int[] indexArray = new int[n];
//		for(int i=0; i<n; i++) {
//			indexArray[i]=-1;
//		}
//		int count=0;
//		int minIndex= Integer.MAX_VALUE;
//		
//		
//		for(int i=1; i<size; i++) {
//			
//			if(indexArray[a[i]]==-1) {
//				indexArray[a[i]]=i;
//			}
//			else {
//				minIndex = Math.min(minIndex, indexArray[a[i]]);
//			}
//		}
//		
//		if(minIndex==Integer.MAX_VALUE) {
//			System.out.println(-1);
//		}
//		else {
//			System.out.println(minIndex);
//		}
					 					
	}
	public static <K, V> K getKey(HashMap<K, V> data, V value)
    {
        for (HashMap.Entry<K, V> entry: data.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
	
}
