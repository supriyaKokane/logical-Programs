package Ahomework;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetPractice {
	
	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		
		h.add(12);
		h.add("Supriya");
		h.add(22.11);
		h.add('A');
		h.add("Pune");
		
		System.out.println("Hashset:-"+h);
		System.out.println("*******************");
		
		//Iterator
		System.out.println("Iterator:-");
		Iterator itr=h.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******************");
		
		//Advance for loop
		System.out.println("Advance for loop:-");
		for(Object obj:h) {
			System.out.println(obj);
		}
		
	}

}
