package AkshaySirPrograms;

public class ReverseSTRING {
	
	public static void main(String[] args) {
		
		String s="nayan";
		String reverse="";
		
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
		
		if(s.equals(reverse)) {
			System.out.println("Given string is Palindrome");
		}else
			System.out.println("Given string is not Palindrome");		
	}

}
