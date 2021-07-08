package Convertions;

public class BinaryToDecimal {

	Integer binaryNumber;
	int decimalNumber;
	
	BinaryToDecimal(int binaryNumber){
		this.binaryNumber = binaryNumber;
		
		String binary = this.binaryNumber.toString();
		String[] reverseBinary= new String[binary.length()];
		
		for(int i=0; i<binary.length(); i++) {
			String temp = ""+binary.charAt(binary.length()-1-i);
			reverseBinary[i] = temp.toString();
		}
		
		int decimal = 0;
		for(int i=0; i<binary.length(); i++) {
			decimal += Integer.parseInt(reverseBinary[i]) * Math.pow(2, i);	
		}
		
		System.out.println("Decimal Number = "+decimal);
	}

}
