package recursion;

public class NToPowerP {

	public static void main(String args[]) {
		
		int base = 5;
		int power = 4;
		
		System.out.println(power(base,power));
		
	}
	
	public static int power(int base, int power) {
		
		if(power == 0) {
			return 1;
		}
		int preans = power(base,power-1);
		return base * preans;
	}
}
