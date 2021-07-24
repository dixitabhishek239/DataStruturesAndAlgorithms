package InclusionExclusion;

public class HowManyMultiples {

	public static void main(String args[]) {
		
		int a = 5;
		int b = 7;
		int n = 40;
		
		System.out.println(MultipleCounter(n,a,b));
		
	}

	private static int MultipleCounter(int n, int a, int b) {

		return ( (n/a) + (n/b) - (n/(a*b)) );
		
	}
	
}
