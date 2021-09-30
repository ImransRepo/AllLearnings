package allAboutJava;

public class Strings {

	public static void main(String[] args) {

		String s1="abc";
		String s2 = "abc";
		
		s2.concat("def");
		System.out.println(s2);
		s2 = s2.concat("def");
		System.out.println(s2);
		
		System.out.println("String Literals /n");
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println("-------------");
		
		String s3 = new String("msd");
		String s4 = new String("msd");
		
		System.out.println("String Using new operator");
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println("--------------");
		
		System.out.println("Literals Compared to new");
		
		String s5 = "abd";
		String s6 = new String("abd");
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
		// Reverse a String
		
		String str = "I am Bad";
		StringBuilder sb = new StringBuilder(str);
		System.out.print(sb.reverse());
		System.out.println();
		
		String str1 = "I am Bad1";
		char[] charArray = str1.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			
			System.out.print(charArray[i]);
			
			
		}
		
		

		
		

	}

}
