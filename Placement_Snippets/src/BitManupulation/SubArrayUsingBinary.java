package BitManupulation;

public class SubArrayUsingBinary {

	public static void main(String[] args) {
		
		int n = 4;
		int[] a = {1,2,3,4};

		
		for(int i=0; i<(n<<1) ; i++) {
			for(int j=0; j<n; j++) {
				if((i & (j<<1))!=0) {
					System.out.print(a[j] + "  ");
				}
			}
			System.out.println();
		}
		
	}

}
