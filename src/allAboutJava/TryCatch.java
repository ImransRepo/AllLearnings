package allAboutJava;

public class TryCatch {

	public static void main(String[] args) {

		try {

			System.out.println("Try Block");
			int div = 1/0;
			
			

		} catch (ArithmeticException ae) {
			
			System.out.println("Invalid Arithmetic Operation");

		} catch (Exception e) {

			System.out.println("Base Exception");

		}

		finally {

			System.out.println("Finally Block");

		}

	}

}
