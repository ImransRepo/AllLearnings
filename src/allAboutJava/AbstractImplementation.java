package allAboutJava;

public class AbstractImplementation extends AbstractClass {

	public static void main(String[] args) {
		
		AbstractImplementation obj = new AbstractImplementation();
		obj.m1();
		obj.m2();
		obj.m3();
		
		}

	
	@Override
	public
	void m1() {

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	
}


abstract class AbstractClass{
	
	abstract public void m1();
	abstract public void m2();
	void m3() {
		
		System.out.println("method 3");
		
	}
	
	
}
