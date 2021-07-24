package recursion;

public class Summation {

	public static void main(String[] args) {

		int n = 4;
		
		System.out.println(Sum(n));
		
	}

	public static int Sum(int n) {
		
		if(n==0) {
			return 0;
		}
		
		int previousSum = Sum(n-1);
		return n + previousSum;
	}
	
}
