package allAboutJava;

public class Prime {

	public static void main(String[] args) {

		int n = 29;
		
		boolean bPrime = false;
		
		for(int i=2; i<=n/2; i++) {
			
			if(n%i == 0) {
				
				bPrime = true;
				break;
			}
		}
		
		if(!bPrime) {
			System.out.println("Prime");
			
			}
		
		else {
			System.out.println("Not Prime");
		}
		
	}

}
