package AdvanceJava;

import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		
		a.add("Name:Supriya");
		a.add("Sirname:Kokane");
		a.add("Rollno:15");
		a.add(412009);
		a.add('A');
		a.add("Pune");
		
		System.out.println(a);
		
		a.add(4,'B');                          //Add
		System.out.println("Add B at 4th index:- "+a);
		
		a.set(2,"Rollno:20");                  //Replace
		System.out.println("Replace Rollno:15 to Rollno:20:-"+a);
		
		a.remove(5);             //remove
		System.out.println("Remove 5th index:-"+a);
		
		System.out.println("array is empty or not:- "+a.isEmpty());       
		
		System.out.println("size of elements:- "+a.size());         
		
		System.out.println("check index of 412009:- "+a.indexOf('B')); 
		
		System.out.println("check pune is present or not:- "+a.contains('B'));   
		
		System.out.println("value at index 3:- "+a.get(3));       
		
		System.out.println("*********************");
		
		//Read the values in arraylist
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
        System.out.println("*********************");	
		
		//Advance for loop
			for(Object obj:a) {
				System.out.println(obj);
			}
	}
	
}
