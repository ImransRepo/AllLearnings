package javaPrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FrequencyOfDigit {

	public static void main(String[] args) {
		
		WithoutCollections wc = new WithoutCollections();
		wc.getFreq();

		Scanner sc = new Scanner(System.in);
		int inputnumber = sc.nextInt();
		
		HashMap<Integer,Integer> CountMap = new HashMap<>();
		
		while(inputnumber != 0) {
			
			int lastdigit = inputnumber % 10;
			
			if(!CountMap.containsKey(lastdigit)) {
				
				CountMap.put(lastdigit, 1);
			}
			else {
				
				CountMap.put(lastdigit, CountMap.get(lastdigit)+1);
			}
			
			inputnumber = inputnumber/10;
			
			
		}
		
		Set<Integer> set = CountMap.keySet();
		
		for(Integer key: set) {
			
			System.out.println(key+" : "+CountMap.get(key));
		}
		
		for(Entry<Integer, Integer> each: CountMap.entrySet() ) {
			
			System.out.println("Key is: "+ each.getKey() +" and Value is: "+ each.getValue());
		}
		
	}
	
}

class WithoutCollections{
	
	void getFreq() {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int[] digitCount = new int[10];
		
		while(input !=0) {
			
			int lastdigit = input % 10;
			
			digitCount[lastdigit]++;
			
			input = input/10;
			
		}
		
		for(int i=0; i<digitCount.length; i++) {
			
			if(digitCount[i] !=0) {
				
				System.out.println("Number: "+ i + "Frequency: "+ digitCount[i]);
			}
		}
		
		sc.close();
	}
	
}
