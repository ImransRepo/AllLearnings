package allAboutJava;

public class RuntimePoly {

	public static void main(String[] args) {

		BB obj1 = new BB();
		obj1.methodA();
		obj1.methodB();
		System.out.println("----------");
		AA obj2 = new BB();
		obj2.methodA();
		System.out.println("----------");
		AA obj3 = new AA();
		obj3.methodA();
		
		
	}

}


class AA{
	
	void methodA() {
		
		System.out.println("Base Class - Method A");
	}
	
}

class BB extends AA{
	
	void methodB() {
		
		System.out.println("Sub Class - Method B");
	}
	
	void methodA() {
		
		System.out.println("Sub class OR - Method");
	}
	
}
