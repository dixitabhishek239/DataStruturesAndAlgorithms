package Convertions;

public class OctalToDecimal {

	Integer octalNumber;
	int decimalNumber;
	
	OctalToDecimal(int octalNumber){
		this.octalNumber = octalNumber;
		
		String octal = this.octalNumber.toString();
		String[] reverseOctal= new String[octal.length()];
		
		for(int i=0; i<octal.length(); i++) {
			String temp = ""+octal.charAt(octal.length()-1-i);
			reverseOctal[i] = temp.toString();
		}
		
		int decimal = 0;
		for(int i=0; i<octal.length(); i++) {
			decimal += Integer.parseInt(reverseOctal[i]) * Math.pow(8, i);	
		}
		
		System.out.println("Decimal Number = "+decimal);
	}

	
}
