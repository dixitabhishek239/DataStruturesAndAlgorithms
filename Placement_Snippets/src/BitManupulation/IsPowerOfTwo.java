package BitManupulation;

public class IsPowerOfTwo {

	public static void main(String args[]) {
		
		int n = 9;
		
		System.out.println(IsPowerOfTwoCalculator(n));
		
	}

	public static boolean IsPowerOfTwoCalculator(int n) {
				
		return ((n & (n-1))==0);
	}
	
}

