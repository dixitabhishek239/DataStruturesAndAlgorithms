package recursionChallenges;

public class OccuranceByRecursion {

	public static void main(String args[]) {
		
		int[] a = {1,2,3,4,5,3,2,3,6};
		int key = 3;
		System.out.println(FirstOccurance(a,0,key));
		System.out.println(LastOccurance(a,0,key));

	}
	
	public static int FirstOccurance(int[] a, int s, int key) {
		
		if(s==a.length) {
			return -1;
		}
		if(a[s]==key) {
			return s;
		}
		
		return FirstOccurance(a,s+1,key);	
	}
	
	public static int LastOccurance(int[] a, int s, int key) {
		
		if(s==a.length) {
			return -1;
		}
		int data = LastOccurance(a,s+1,key);
		if(data!=-1) {
			return data;
		}
		if(a[s]==key) {
			return s;
		}
		return -1;
		
	}
}
