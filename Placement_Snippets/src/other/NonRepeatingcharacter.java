package other;

public class NonRepeatingcharacter {

	public static void main(String arg[]) {
		
		String a = "aabccdeffqwer"; // bde ans - 3 (12/13)
		int answer = 0;
		
		if(a.length()==0) {
			System.out.println(0);
		}
		for(int i=0; i<a.length(); i++) {
			int counter = 0;
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(i)==a.charAt(j)) {
					counter ++;
				}
			}
			if(counter==1) {
				answer++;
			}
			
		}
		System.out.println(answer);
		
	}
	
}
