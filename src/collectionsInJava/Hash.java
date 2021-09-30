package collectionsInJava;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hash {

	static int i;
	
	int j=20;
	
	public static void main(String[] args) {
		
		i=10;
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		
		map1.put("Hussain", 20);
		map1.put("Begum", 10);
		map1.put("Imran",30);
		map1.put("Farhana",10);
		
		map1.remove("Farhana");
		
		System.out.println(map1);
		
		Map m = Collections.synchronizedMap(map1);
		
		m.put("Imran", 20);
		m.put("Hussain",30);
		m.put("Farhana",10);
		
		System.out.println(m);
		
		Hash d = new Hash();
		d.dummy();
		
//		j=20;
		
		
	}
	
	public static void dummy() {
		
		i=20;
		
		System.out.println(i);
	}

}
