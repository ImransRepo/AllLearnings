package allAboutJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapImplementation {

	public static void main(String[] args) {

		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("Ten", 10);
		hm.put("Twenty", 20);
		hm.put("Twenty", 20);
		System.out.println("Hash Map values are: "+ hm);
		
		Map<String,Integer> hm1 = new HashMap<>();
		hm1.put("Imran", 5);
		hm1.put("Hussain", 7);
		System.out.println("HM1 values: "+ hm1);
		
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new TreeSet<>();
		Set<String> set3 = new LinkedHashSet<>();
		
	}

}
