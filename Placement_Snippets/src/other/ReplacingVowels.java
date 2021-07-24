package other;

public class ReplacingVowels {

	public static void main(String[] args) {

		String s = "Abhishek Sachchidanand Dixit";
		
		s = s.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(s);
		
	}

}
