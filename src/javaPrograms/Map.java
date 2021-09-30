package javaPrograms;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {

		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(10, 20);
		map.put(30, 25);
		map.put(20, 30);
		map.put(50, 35);
		map.put(70, 40);
		
		System.out.println(map);
		
		Integer integer = map.get(10);
		System.out.println(integer+1);
		
		
	}

}
