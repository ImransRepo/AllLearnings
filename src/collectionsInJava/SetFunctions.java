package collectionsInJava;

import java.util.HashSet;
import java.util.Set;

public class SetFunctions {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		set1.add("Imran");
		set1.add("Hussain");
		boolean add = set1.add("Imran");
		System.out.println("Add Duplicates Result: "+ add);
		
		set1.remove("Imran");
		System.out.println("Set After Removing: "+set1);
		
		boolean add1 = set1.add("Imran");
		System.out.println("Add New Result: "+ add1);
		
		System.out.println(set1);
		
	}

}
