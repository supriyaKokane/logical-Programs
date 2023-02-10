package OOPS;

public class mock {
	
	public static void main(String[] args) {
		
		String Name="Nayan";
		String reverse="";
		
		System.out.println("Name:- "+ Name);
		
		for(int i=Name.length()-1;i>=0;i--) {
			reverse=reverse+Name.charAt(i);
		}
		System.out.println("Reverse:- "+reverse);
		
		if(Name.equals(reverse))  {
			System.out.println("The given string is palindrome");
		}else
			System.out.println("The given string is not palindrome");
	}

}
