package other;

public class arrayDiscountPersistent {

	public static void main(String args[]) {
		
		int[] a = {2,3,5,1,9,7};
		int data = 235197;
		String str = "235197";
		
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				evenSum += a[i];
			}
			else {
				oddSum += a[i];
			}
		}
		System.out.println(evenSum*oddSum);
		
	}
	
}
