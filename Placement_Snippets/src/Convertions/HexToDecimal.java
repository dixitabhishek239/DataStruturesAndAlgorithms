package Convertions;

public class HexToDecimal {

	String hexNumber;
	int decimalNumber;
	
	HexToDecimal(String hexNumber){
		this.hexNumber = hexNumber;
		
		String hex = this.hexNumber.toString();
		String[] reverseHex= new String[hex.length()];
		
		for(int i=0; i<hex.length(); i++) {
			String temp = ""+hex.charAt(hex.length()-1-i);
			reverseHex[i] = temp.toString();
		}
		
		int decimal = 0;
		for(int i=0; i<hex.length(); i++) {
			if(reverseHex[i].equals("A")) {
				decimal += 10 * Math.pow(16, i);	
			}else if(reverseHex[i].equals("B")){
				decimal += 11 * Math.pow(16, i);
			}else if(reverseHex[i].equals("C")){
				decimal += 12 * Math.pow(16, i);
			}else if(reverseHex[i].equals("D")){
				decimal += 13 * Math.pow(16, i);
			}else if(reverseHex[i].equals("E")){
				decimal += 14 * Math.pow(16, i);
			}else if(reverseHex[i].equals("F")){
				decimal += 15 * Math.pow(16, i);
			}else {
				decimal += Integer.parseInt(reverseHex[i]) * Math.pow(16, i);	
			}
		}
		
		System.out.println("Decimal Number = "+decimal);
	}

	
}
