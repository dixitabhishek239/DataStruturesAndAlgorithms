package recursionChallenges;

public class IsSortedArray {

	public static void main(String args[]) {
		
		int n = 5;
		int[] a = {1,2,3,8,5};
		int s = 0;
		System.out.println(IsSorted(a,s,n));
		
	}
	
	public static boolean IsSorted(int[] a,int s, int n) {
	
		if(s+1==n) {
			return true;
		}	
		boolean restArray = IsSorted(a,s+1,n);
		return (a[s]<a[s+1] && restArray);
		
		
	}
	
}
