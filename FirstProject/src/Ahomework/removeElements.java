package Ahomework;

import java.util.ArrayList;
import java.util.HashSet;

public class removeElements {
	
	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("Devansh");
		a.add("mihir");
		a.add("sanvi");
		a.add("Pakhi");
		a.add("indrayani");
		a.add("Devansh");
		a.add("mihir");
		a.add("sanvi");
		
		System.out.println("Arraylist:-"+a);
		
		System.out.println("*************************************");
		
		HashSet<String> h=new HashSet<String>();
		
		h.add("Supriya");
		h.add("Pravin");
		
		System.out.println("Hashset:-"+h);
		
		System.out.println("*************************************");
		
		h.addAll(a);
		System.out.println("After adding:-"+h);
		
	}

}
