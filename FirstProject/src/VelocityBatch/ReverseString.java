package VelocityBatch;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String original="abcdef";
		String reverse="";
		
		System.out.println("Original:- "+original);
		
		for(int i=original.length()-1;i>=0;i--) {
			reverse= reverse + original.charAt(i);
		}
		System.out.println("Reverse:- "+reverse);
		
		if(original.equals(reverse))  {
			System.out.println("The given string is palindrome");
		}else
			System.out.println("The given string is not palindrome");
	}

}	
