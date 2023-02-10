package AkshaySirPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class StringSorting {
	
	public static void main(String[] args) {
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("shubhangi");
		s.add("amit");
		s.add("sagar");
		s.add("devansh");
		s.add("supriya");
		s.add("viransh");
		System.out.println("Before Sorting:-"+s);
		
		Collections.sort(s);
		System.out.println("After sorting:-" +s);
		
		Collections.sort(s, Collections.reverseOrder());
		System.out.println("After Sorting:-"+s);
	}

}
