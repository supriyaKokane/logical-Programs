package Ahomework;

public class ReverseString {

	public static void main(String[] args) {
		
		String s="Nayan";
		String reverse="";
		
		System.out.println("String Before Reverse:- "+s);
		
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println("String After Reverse:- "+reverse);
	
	    if(s.equals(reverse))  {
		    System.out.println("The given string is palindrome");
	    }else
		    System.out.println("The given string is not palindrome");
	
	}
}
	
