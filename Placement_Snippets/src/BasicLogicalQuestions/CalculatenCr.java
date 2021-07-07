package BasicLogicalQuestions;

import java.util.Scanner;
import BasicLogicalQuestions.FactorialOfNumber;

public class CalculatenCr {

	public static void main(String[] args) {

		System.out.println("nCr Calculator");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("n = ");
		int n = scanner.nextInt();

		System.out.println("r = ");
		int r = scanner.nextInt();
		
		int nr = n - r;

		n = FactorialOfNumber.factorial(n);
//		System.out.println(nr);
		nr = FactorialOfNumber.factorial(nr);
		r =  FactorialOfNumber.factorial(r);
		
//		System.out.println("n nr r = "+n+" "+nr+" "+r);
		
		int ans = ncrCalculator(n,nr,r);
		
		System.out.println("Answer : "+ans);
		
	}
	
	public static int ncrCalculator(int n, int nr, int r) {
		
		int answer = 1;
		
		answer = n/(r*nr);
		
		return answer;
		
	}

}
