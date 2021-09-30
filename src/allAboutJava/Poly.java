package allAboutJava;

public class Poly {

	public static void main(String[] args) {

		subclass1 obj1 = new subclass1();
		Poly obj2 = new subclass1();
//		subOfsub obj3 = new sub();  /*Not Possible*/
		
		Poly poly1 = new subclass1();
		poly1.mainmethod();
		
		Poly poly = new Poly();
		poly.mainmethod();
		
		
		
		
	}
	
	void mainmethod() {
		
		System.out.println("Main");
		
	}
	

}


class subclass1 extends Poly {
	
	
	
	void submethod() {
		
		System.out.println("Sub Method 1");
		
	}
	
	void mainmethod() {
		
		super.mainmethod();
		
		System.out.println("Sub Method 2 - OR");
	}
	
	
}

class subOfsub extends Poly {
	
void subOfsub() {
		
		System.out.println("Sub Method 1");
		
	}
	
	
}
