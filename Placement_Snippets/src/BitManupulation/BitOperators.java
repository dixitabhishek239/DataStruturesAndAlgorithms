package BitManupulation;

public class BitOperators {

	public static void main(String args[]) {
	
		int n = 5;
		int position = 1;
		int value = 1;
		
//		System.out.println(getBit(n,position));
//		System.out.println(setBit(n,position));
//		System.out.println(clearBit(n,position));
		System.out.println(updateBit(n,position,value));
		
	}
	
	public static boolean getBit(int n, Integer position) {
		return ( (n & (position << 1)) != 0 );
	}

	public static int setBit(int n, Integer position) {
		return (n | (position << 1));
	}
	
	public static int clearBit(int n, Integer position) {
		return (n & ~(position << 1));
	}

	public static int updateBit(int n, Integer position, int value) {
		n =  (n | (position << 1));
		return (n | (position<<value));
	}
}
