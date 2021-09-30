package allAboutJava;

public class ClassA extends ClassB {

	public static void main(String[] args) {
		
		//
		ClassA a = new ClassA();
		ClassB b = new ClassA();
		ClassB base = new ClassB();
		
		a.methodA();
		a.methodB();
		
		b.methodB();
		
		base.methodB();
		
	}
	
	
	void methodA() {
		
		System.out.println("Sub");
	}
	
	void methodB() {
		
		super.methodB();
		System.out.println("Overriden MethodB");
		
	}
	
	
}

class ClassB {
	
	void methodB() {
		System.out.println("Base");
	}
}
