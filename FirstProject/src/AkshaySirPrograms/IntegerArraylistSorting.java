package AkshaySirPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerArraylistSorting {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(25);
		a.add(10);
		a.add(42);
		a.add(5);
		a.add(12);
		
		System.out.println("Before Sorting:-"+a);
		
		Collections.sort(a);
		System.out.println("Ascending Order:- "+a);
		
		Collections.sort(a, Collections.reverseOrder());
		System.out.println("Descending Order:- "+a);
		
	}

}
