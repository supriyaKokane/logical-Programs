package AkshaySirPrograms;

import java.util.Arrays;

public class StringArraySorting {
	
	public static void main(String[] args) {
		
		String s[]= {"shubhangi","amit","sagar","supriya","devansh","viransh"};
		
		System.out.println("Before Sorting:-");
		for(int i=0;i<=s.length-1;i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(s);;
		System.out.println("Ascending Sorting:-");
		for(int i=0;i<=s.length-1;i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		
		System.out.println("Descending Sorting:-");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
	}

}
