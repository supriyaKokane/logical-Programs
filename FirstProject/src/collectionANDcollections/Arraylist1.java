package collectionANDcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 {

	public static void main(String[] args) {
		
		//1)Declaration of array:-
		ArrayList a=new ArrayList();
		a.add("Supriya");
		a.add("Pravin");
		a.add('D');
		a.add(22.11);
		a.add("Pune");
		a.add("Mumbai");
		
		//2)Adding one element:-
		a.add(3,'V');
		System.out.println("Add V at 3rd index:-"+a);
		
		//3)Replace element:-
		a.set(5,'A');
		System.out.println("Replace Pune by A:-"+a);
		
		//4)Remove element:-
		a.remove(5);
		System.out.println("Remove 5th index:- "+a);
		
		//5)To check how many elements are present:-
		System.out.println("Total elements:-"+a.size());
		
		//6)Index of specific element:-
		System.out.println("Index of 22.11:-"+a.indexOf(22.11));
		
		//7)check element of specific index:-
		System.out.println("Element at 3rd index:-"+a.get(3));
		
		System.out.println("*****************");
		
		//8)read all element using for loop:-
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("*****************");
		
		//9)Advance for loop:-
		for(Object obj:a) {
			System.out.println(obj);
		}
		
		Collections.reverse(a);
		System.out.println("Reverse elements:-"+a);
		
		System.out.println("*****************");
		
		//Iterator:
		Iterator itr=a.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		System.out.println("*****************");
		
		//list iterator:
		ListIterator litr=a.listIterator();
		     while(litr.hasNext()) {
		    	 System.out.println(litr.next());
		     }
	}

}
