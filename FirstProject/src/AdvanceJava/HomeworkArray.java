package AdvanceJava;

import java.util.ArrayList;
import java.util.Collections;

public class HomeworkArray {
	
	public static void main(String[] args) {

	
	ArrayList<String> ab=new ArrayList<String>();
	
	ab.add("Supriya");
	ab.add("Shubhangi");
	ab.add("Anuja");
	ab.add("Sagar");
	ab.add("248566");
	ab.add("A");
	ab.add("1");
	
	System.out.println(ab);
	
	//add value at index 3
	ab.add(3,"Mumbai");
	System.out.println("Add mumbai at 3 index:- "+ ab);
	
	ab.set(4,"Dhonde");
	System.out.println("Replace Sagar to Dhonde at index 4:-"+ab );
	
	ab.remove(7);
	System.out.println("Remove index 7:- "+ab);
	
	System.out.println("Array is empty or not:-"+ab.isEmpty());
	
	System.out.println("Size of arraylist:-"+ ab.size());
	
	System.out.println("index of supriya:-"+ ab.indexOf("Supriya"));
	
	System.out.println("check B is present or not:-"+ ab.contains("B"));
	
	System.out.println("Value at 6th index:-"+ ab.get(6));
	
	//how to read all values in arraylist
	for(int i=0;i<ab.size();i++) {
		System.out.println(ab.get(i));
	}
	System.out.println("************");
	
	//Advance for loop
	for(Object ob:ab) {
		System.out.println(ob);
	}
	
	Collections.reverse(ab);
	System.out.println(ab);
	}
}
