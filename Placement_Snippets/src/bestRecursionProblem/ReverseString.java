package bestRecursionProblem;

public class ReverseString {

	public static void main(String args[]) {
		
		String a = "Abhishek";
		
		ReverseStringRecursion(a);
		
	}
	
	public static void ReverseStringRecursion(String a) {
		
		if(a.length()==0) {
			return;
		}
		String subString = a.substring(1);
		ReverseStringRecursion(subString);
		System.out.print(a.charAt(0));
	}
	
}
