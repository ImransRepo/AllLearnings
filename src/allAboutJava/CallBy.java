package allAboutJava;

public class CallBy {

	public static void main(String[] args) {

		CallBy cb = new  CallBy();
		cb.method1(10);
		cb.method2(cb);
		
		
	}
	
	void method1(int i) {
		
		System.out.println("Call By Value: "+i);
		
	}

	void method2(CallBy cb) {
		
		System.out.println("Call By Reference");
		
	}
}
