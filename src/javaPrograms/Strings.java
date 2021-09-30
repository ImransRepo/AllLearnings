package javaPrograms;

public class Strings {
	
	
	public static void main(String[] args) {
		
		String str= "imran", str2="hussain";
		
		str = str+str2;
		System.out.println(str+ ","+str.length()+","+str2.length());
		// imranhussain ; now str2=str.substring(0,str.len-str2.len); includes begin n end index
		// str = str.sub(str2.lenth); // only begin index
		str2 = str.substring(0, str.length()-str2.length());
		str = str.substring(str2.length());
				
		System.out.println(str+" , "+str2);
		
		
		String a="atos", b="syntel";
		
		a = a+b;
		
		b= a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
