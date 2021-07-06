package loop_pattern;

import java.util.Scanner;

public class pattern1 {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int row,column,dimension;
		
//		System.out.println("Enter the dimensions of Matrix : ");
//		System.out.print("Row - ");	
//		row = Integer.parseInt(scanner.nextLine());
//		System.out.print("Column - ");
//		column = scanner.nextInt();

//		starPattern1(row,column);
//		starPattern2(row,column);
	
		System.out.println("Enter the dimensions of Square Matrix : ");
		System.out.print("Value - ");	
		dimension = Integer.parseInt(scanner.nextLine());
//		
//		starPattern3(dimension);
//		starPattern4(dimension);
		starPattern5(dimension);
		
//		starPattern7(dimension);
		
//		starPattern6(dimension);
				
	}
	
	public static void starPattern1(int row, int column) {		
				
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}
	
	public static void starPattern2(int row, int column) {
			
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				if(i==1 || j==1 || i==row || j==column) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public static void starPattern3(int dimension) {		
		
		for(int i=dimension; i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}
	
	public static void starPattern4(int dimension) {	
		
		for(int i=1; i<=dimension; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

	public static void starPattern5(int dimension) {
		
		int counter = 1;
		
		for(int i=1; i<=dimension; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}

	}

	public static void starPattern6(int dimension) {
		
		for(int i=1; i<=dimension; i++) {
			for(int j=1; j<=dimension; j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			int space = (2*dimension - 2*i)/2;
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=dimension; j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i=dimension; i>0; i--) {
			for(int j=dimension; j>0; j--) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			int space = (2*dimension - 2*i)/2;
			for(int j=1; j<=space; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=dimension; j++) {
				if(j<=i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		
	}

	public static void starPattern7(int dimension) {
				
		for(int i=1; i<=dimension; i++) {
			
			int blanks = dimension-i;
			
			for(int j=0; j<=blanks; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
