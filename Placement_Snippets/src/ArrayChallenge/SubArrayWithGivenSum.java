package ArrayChallenge;

import java.util.Scanner;

public class SubArrayWithGivenSum {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		
		int givenSum = scanner.nextInt();
		
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i] = scanner.nextInt();
		}
		
//		System.out.println(size+ "  "+ givenSum);
		
		int sum = 0;
		int flag = 0;
		for(int i=0; i<size; i++) {
			for(int j=i; j<size; j++){
			    sum += a[j];
//			    System.out.println(sum);
			    if(sum==givenSum){
                    System.out.println(i+1+"  "+(j+1));
                    flag = 1;
                    break;
			    }
			}
			sum = 0;
			if(flag == 1) {
				break;
			}
		}
		if(flag != 1) {
			System.out.println("Not Found");
		}

	}
	
}
