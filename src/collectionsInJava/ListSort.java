package collectionsInJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();

		list1.add("Imran1");
		list1.add("Imran2");
		list1.add("Imran3");
		list1.add("Imran4");

		System.out.println(list1);

		for (String each : list1) {

			System.out.println(each);
		}

		list1.remove(0);

		for (String each : list1) {

			System.out.println(each);
		}
		
		Collections.sort(list1);
		
		Collections.reverse(list1);
		
		System.out.println(list1);

	}

}
