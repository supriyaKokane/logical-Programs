package collectionANDcollections;

import java.util.ArrayList;
import java.util.Collections;

public class NumberReverse {

	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(12);
		a.add(6);
		a.add(19);
		a.add(8);
		a.add(45);
		a.add(32);
		a.add(64);
		a.add(3);
		
		System.out.println("Before Sorting:-"+a);
		
		//Ascending order:
		Collections.sort(a);
		System.out.println("Ascending order:-"+a);
		
		//Descending order:-
		Collections.sort(a, Collections.reverseOrder());
		System.out.println("Descending order:-"+a);
		
	}
}
