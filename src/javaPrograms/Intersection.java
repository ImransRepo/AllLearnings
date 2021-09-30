package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {

		int[] arr1 = { 2, 3, 5, 4, 6, 7 };
		int[] arr2 = { 2, 5, 3, 8, 9, 0 };

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();

		for (int each : arr1) {

			list1.add(each);
		}

		for (int each : arr2) {

			list2.add(each);
		}
		
		list1.retainAll(list2);
		
		System.out.println(list1);

	}

}
