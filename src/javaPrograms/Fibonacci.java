package javaPrograms;

public class Fibonacci {

	public static void main(String[] args) {

		int n1 = 0, n2=1, n3;
		
		System.out.print(n1+",");
		System.out.print(n2);
		
		for(int i=3; i<=8; i++) {
			
			n3 = n1+n2;
			System.out.print(","+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}

}
