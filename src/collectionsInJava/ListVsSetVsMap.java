package collectionsInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ListVsSetVsMap {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		set1.add("str1");
		set1.add("str2");
		set1.add("str3");
		set1.add("str4");
		
		boolean contains = set1.contains("str5");
		System.out.println(contains);
		
		System.out.println(set1);
		
		
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(10, "Ten");
		map1.put(20, "Twenty");
		map1.put(30, "Thirty");
		map1.put(40, "Forty");
		
		System.out.println(map1.get(20));
		System.out.println(map1.get(30));
		System.out.println(map1.get(40));
		
		System.out.println(map1);
		
		for(Entry<Integer,String> each: map1.entrySet()) {
			System.out.println(each.getKey() + "," + each.getValue());
		}
		
		
		/* Get fn using List for Set */
		
		
		List<String> list1 = new ArrayList<String>(set1);
		
		for(String each : list1){
			
			System.out.println(each);
			
		}
		
		/* or */
		
		System.out.println("Adding Set to a List");
		System.out.println("--------------------");
		
		for (int i=0; i<list1.size(); i++) {
			
			System.out.println(list1.get(i));
			
		}
		
		
	}

}
