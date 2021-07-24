package other;

public class AddingAtEvenIndex {

	public static void main(String args[]) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,0};
		int sum = 0;
		for(int i=0; i<a.length; i+=2) {
			sum += a[i];
		}
		System.out.println(sum);
		
	}
	
}
