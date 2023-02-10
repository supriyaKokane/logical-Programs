package collectionANDcollections;

import java.util.ArrayList;
import java.util.Collections;

public class StringReverse {
	
	public static void main(String[] args) {
	
	ArrayList<String> ar=new ArrayList<String>();
	
	ar.add("Baramati");
	ar.add("XYZ");
	ar.add("mumbai");
	ar.add("pune");
	ar.add("Mumbai");
	ar.add("Nashik");
	ar.add("Thane");
	ar.add("nagpur");
	
	System.out.println("Arraylist before sorting:-"+ar);
	
	//Ascending Order:-
	Collections.sort(ar);
	System.out.println("Arralist sorting(Ascending):-"+ar);
	
	//descending order:-
	Collections.sort(ar, Collections.reverseOrder());
	System.out.println("Arralist sorting(descending):-"+ar);
	
	
	
	}
}
