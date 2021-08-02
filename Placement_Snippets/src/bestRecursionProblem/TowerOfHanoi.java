package bestRecursionProblem;

public class TowerOfHanoi {

	public static void main(String args[]) {
		
		TowerOfHanoiSolution(6, 'A', 'C', 'B');
		
	}
	
	public static void TowerOfHanoiSolution(int n, char source, char destination, char helper) {
		
		if(n==0) {
			return;
		}
		
		TowerOfHanoiSolution(n-1, source, helper, destination);
		System.out.println("Move from "+source+" to "+destination);
		TowerOfHanoiSolution(n-1, helper, destination, source);
		
	}
	
}
