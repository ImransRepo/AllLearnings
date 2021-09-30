package allAboutJava;

public class subclass12  {

	public static void main(String[] args) {

		DefaultNProtected dnp = new DefaultNProtected();
		
		System.out.println(dnp.num);
		System.out.println(dnp.str);
		
		dnp.defaultMethod();
		dnp.protectedMethod();
	}

}
