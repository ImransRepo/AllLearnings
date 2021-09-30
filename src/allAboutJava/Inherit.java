package allAboutJava;

public class Inherit extends B {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
		
		A obj2 = new B();
		obj2.method1();
		obj2.method2();
		obj2.method3();
		
		
	}
	
	
}

class A{
	
	void method1() {
		System.out.println("Method 1");
	}
	
	void method2() {
		System.out.println("Method 2");
	}
	
	void method3() {
		System.out.println("Method 3");
	}
}

class B extends A{
	
	void method4() {
		System.out.println("Method 4");
	}
	
	void method5() {
		System.out.println("Method 5");
	}
	
	
	
}
