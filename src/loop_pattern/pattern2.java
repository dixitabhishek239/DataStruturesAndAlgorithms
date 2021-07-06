package loop_pattern;

import java.util.Scanner;

public class pattern2 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int dimension;
		System.out.println("Enter the dimensions of Square Matrix : ");
		System.out.print("Value - ");	
		dimension = Integer.parseInt(scanner.nextLine());
		
//		advancePattern1(dimension);
		AdvancePattern2(dimension);
//		advancePattern3(dimension);
//		advancePattern4(dimension);

	}

	public static void advancePattern1(int dimension) {
			
		for(int i=0; i<dimension; i++) {
			for(int j=1; j<=dimension-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void AdvancePattern2(int dimension) {
		
		int counter = 1;
		
		for(int i=0; i<dimension; i++) {
			for(int j=0; j<dimension; j++) {
				if(j<=i) {
					if(counter%2==1) {
						System.out.print("1 ");
					}else {
						System.out.print("0 ");
					}

				}
				counter++;
			}
			System.out.println();
		}
		
	}
	
	public static void advancePattern3(int dimension) {
		
		for(int i=0; i<dimension; i++) {
			for(int j=0; j<dimension-1-i; j++) {
				System.out.print("  ");
			}
			for(int j=0; j<dimension; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void advancePattern4(int dimension) {
		
		for(int i=0; i<dimension; i++) {
			for(int j=0; j<dimension-1-i; j++) {
				System.out.print("  ");
			}
			for(int j=i+1; j>=1; j--) { 
				System.out.print(j+" ");
			}
			for(int j=2; j<=i+1; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	
		for(int i=0; i<dimension; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			for(int j=dimension-i; j>=1; j--) {
				System.out.print(j+" ");
			}
			for(int j=2; j<=dimension-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
