package collectionANDcollections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
	
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add(123);
		v.add("abc");
		v.add("xyz");
		v.add('A');
		
		System.out.println(v);
		
		v.add(2,'S');   //add
		System.out.println("Add S:-"+v);
		
		v.set(4,'B');
		System.out.println("Replace A by B:-"+v);
		
		v.remove(0);
		System.out.println("Remove 123:-"+v);
		
		System.out.println("Total elements:-"+v.size());
		
		System.out.println("index of xyz:-"+v.indexOf("xyz"));
		
		System.out.println("element at index 1:-"+v.get(1));
		
		System.out.println("ABC is persent or not:-"+v.contains("ABC"));
		
		System.out.println("Empty or not:-"+v.isEmpty());
		
		System.out.println("****************"); 
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		
		System.out.println("****************");
		
		for(Object obj:v) {
			System.out.println(obj);
		}
		System.out.println("****************");
		
		//Enumeration
		Enumeration en=v.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
