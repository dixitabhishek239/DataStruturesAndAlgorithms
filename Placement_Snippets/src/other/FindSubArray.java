package other;

public class FindSubArray {

	public static void main(String args[]) {
		
		String str = "TimsvTimagTimsgTimsvTimaT";
		String data = "Tim";
		int counter = 0;
		
		for(int i=0; i<=str.length()-data.length(); i++) {
			
			if(str.charAt(i)==data.charAt(0)) {
				if(str.charAt(i+1)==data.charAt(1)) {
					if(str.charAt(i+2)==data.charAt(2)) {
						counter++;
					}
				}
			}

		}
		System.out.println(counter + "  " +str.length() + "  "+ data.length());
		
	}
	
}
