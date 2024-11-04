package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListNumbers {
	
	public static void main(String[]args) {
		
		//create a list of numbers
		
		List<Integer> numbers = new ArrayList<>()	;
		numbers.add(34);
		numbers.add(12);
		numbers.add(9);
		numbers.add(56);
		numbers.add(1);
		
		//unsorted
		System.out.println("unsorted list: " +numbers);
		
		//sort the list in ascending order
		
		Collections.sort(numbers);
		System.out.println("ascending order list: " +numbers);
		
		//sort the list in descending order
		
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("descending order list" +numbers);
		
	}
}
