package InclusionExclusion;

public class EuclidAlgorithm {

	public static void main(String[] args) {

		int a = 5;
		int b = 24;
		
		int min = Math.min(a, b);
		int max = a+b-min;
		
//		while(min!=0) {
//			int rem = max%min;
//			max = min;
//			min = rem;
//		}
		
		System.out.println(gcd(max,min));
		
//		System.out.println(max);
		
	}

	public static int gcd(int a, int b) {
		
		while(b!=0) {
			int rem = a%b;
			a = b;
			b = rem;
		}

		return a;
		
	}
	
}
