package AkshaySirPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("one");
		a.add("two");
		a.add("one");
		a.add("three");
		a.add("two");
		
		HashSet<String> h=new HashSet<String>();
		h.add("four");
		h.add("five");
		h.add("six");
		
		h.addAll(a);
		System.out.println(h);
		
		
	}

}
