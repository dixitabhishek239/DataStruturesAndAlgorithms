package Convertions;

public class BinaryToDecimal {

	Integer binaryNumber;
	int decimalNumber;
	
	BinaryToDecimal(int binaryNumber){
		this.binaryNumber = binaryNumber;
		
		String binary = this.binaryNumber.toString();
		
		int decimal = 0;

		for(int i=0; i<binary.length(); i++) {
			
			String a = binary.subSequence(i, i+1).toString();
			//System.out.println(Math.pow(2, i));
			int temp = (int) (Integer.parseInt(a) * Math.pow(2, i));
			System.out.println(temp);
			decimal += temp;
			//System.out.println("decimal = "+decimal);
			
		}
		
		System.out.println(decimal);
	}

}
