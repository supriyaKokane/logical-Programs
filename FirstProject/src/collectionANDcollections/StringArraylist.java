package collectionANDcollections;

import java.util.ArrayList;
import java.util.Collections;

public class StringArraylist {
	
	public static void main(String[] args) {
		
		ArrayList<String> s= new ArrayList<String>();
		
		s.add("Devansh");
		s.add("mihir");
		s.add("Sanvi");
		s.add("Pakhi");
		s.add("indrayani");
		s.add("B");
		s.add("32564");
		System.out.println("Original string:-"+s);
		
		//1)Adding one more element at specific index:-
		s.add(3,"naksh");
		System.out.println("Adding naksh at 3rd index:-"+s);
		
		//2)Replace element :-
		s.set(6,"Raaj");
		System.out.println("Replace B by Raaj:-"+s);
		
		//3)Remove element:-
		s.remove(7);
		System.out.println("Remove 32564:-"+s);
		
		System.out.println("Total elements:-"+s.size());
		
		System.out.println("Index of Sanvi:-"+s.indexOf("Sanvi"));
		
		System.out.println("Element at index 1:-"+s.get(1));
		
		System.out.println("Devanshi is peresent or not:-"+s.contains("Devanshi"));
		
		System.out.println("****************");
		//for loop:-
		for(int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		} 
		
		System.out.println("****************");
		
		//advance for loop:-
		for(Object obj:s) {
			System.out.println(obj);
		}
		
		//Reverse order:-
		Collections.reverse(s);
		System.out.println(s);
	}

}
