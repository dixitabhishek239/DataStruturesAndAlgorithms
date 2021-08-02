package bestRecursionProblem;

public class ReplacingSubString {

	public static void main(String args[]) {
		
		String a = "ppippasdpipasdpi";
		
		ReplaceData(a);
		
	}
	
	public static void ReplaceData(String a) {
		
		if(a.length()==0) {
			return;
		}
		
//		String s = a.substring(1);
		if(a.length()>=2) {
			if(a.charAt(0)=='p' && a.charAt(1)=='i') {
				System.out.print("3.14");
				ReplaceData(a.substring(2));
			}
			else {
				System.out.print(a.charAt(0));
				ReplaceData(a.substring(1));
			}
		}
		else {
			return;
		}
		//		String subString = a.substring(1);
//		if(subString.length()==1) {
//			return;
//		}
//		else {
//			char f = subString.charAt(0);
//			char s = subString.charAt(1);
//			if(f=='p' && s=='i') {
//				System.out.print("3.14");
//			}
//			else {
//				System.out.print(subString.charAt(0));
//			}
//		}
//		ReplaceData(subString);
		
	}
	
}
