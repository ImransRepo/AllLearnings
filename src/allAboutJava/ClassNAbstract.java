package allAboutJava;

public class ClassNAbstract extends dummy {
	
	String str;
	
	ClassNAbstract(String s){
		
		super();
		System.out.println("dum value is: "+dum);
		this.str=s;
		System.out.println("String value: "+ this.str);
	}

	public static void main(String[] args) {

		ClassNAbstract a = new ClassNAbstract("Imran");
		dummy b = new ClassNAbstract("Hussain");
		b.dummymethod();
		
		
	}

	@Override
	void dummymethod() {
System.out.println("output");		
	}

}

abstract class dummy {
	
	String dum;
	
	dummy(){
		this.dum="ten";
//		System.out.println("st");
	}
	
	abstract void dummymethod();
	
}


abstract class nonAbstract{
	
	abstract void method();
	
}

interface dummyint{
	
	void methd1();
	
	
	
}
