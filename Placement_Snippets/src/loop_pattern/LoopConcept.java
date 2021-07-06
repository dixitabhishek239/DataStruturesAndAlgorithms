package loop_pattern;

public class LoopConcept {
	
	public static void main (String args[]) {
		
		int arr[] = {3,7,2,1,6};
		
		// 3 7 2 1 6
		for(int i=0; i<5; i++) { // 1
			for(int j=i+1; j<5; j++) { // 6
				//if no is greater print the number break
				if(arr[j]>arr[i]) {
					System.out.println(arr[j]);
					break;
				}
				//if no is smaller then skip to uptill we get the greater
				else {
					if(arr[i]>arr[j]) {
						// if not found the greater print -1
						if(j==4) {
							System.out.println("-1");
						}
						continue;
					}
				}
								
			}
			if(i==4) {
				//last number will print -1
				System.out.println("-1");
			}
		}
				
	}

}
