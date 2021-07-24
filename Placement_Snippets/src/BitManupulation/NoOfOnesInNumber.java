package BitManupulation;

public class NoOfOnesInNumber {

	public static void main(String args[]) {
	
		int n = 8;
		int count = 0;
		
		while(n!=0) {	
			System.out.println(n);
			n = n & (n-1);
			count ++;
		}
		
		System.out.println(count);
	}
	
}
