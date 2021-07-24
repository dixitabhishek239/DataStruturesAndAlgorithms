package BitManupulation;

public class UniqueNumber {

	public static void main(String args[]) {
		
		int n = 5;
		int[] a = {1,4,3,2,1};
		int xorsum = 0;
		for(int i=0; i<n; i++) {
			xorsum = xorsum ^ a[i];
		}
		System.out.println(xorsum);
	}
	
}
