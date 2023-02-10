package AkshaySirPrograms;

import java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args) {
		
		int ar[] = {20,50,40,30,20};
		System.out.println("----before sorting----");
		
		for (int i = 0; i <= ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);   //sorting
		System.out.println("----after sorting----");
		for (int i = 0; i <= ar.length-1; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println("----descending order ----");
		for (int i = ar.length-1; i>=0; i--) {
			System.out.println(ar[i]);
		}

	}

}
