package recursionChallenges;

public class DescendingOrder {

	public static void main(String args[]) {
	
		int n = 5;

		IncreasingOrderRecursion(n);
		
	}

	private static void DescendingOrderRecursion(int n) {

		if(n==0) {
			return;
		}
		System.out.println(n);
		DescendingOrderRecursion(n-1);
		return;
		
	}
	
	private static void IncreasingOrderRecursion(int n) {
		if(n==0) {
			return;
		}
		IncreasingOrderRecursion(n-1);
		System.out.println(n);
		return;
	}
	
}
