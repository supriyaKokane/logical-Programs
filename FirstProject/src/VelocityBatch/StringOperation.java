package VelocityBatch;

public class StringOperation {
	
	public static void main(String[] args) {
		
		String s="Velocity";
		String s1="Velociity";
		String s2="    Welcome to Java     ";
		
		//To calculate the length
		System.out.println("The length of the string is "+ s.length());
		
		//Uppercase
		System.out.println("The uppercase is "+ s.toUpperCase());
		
		//LowerCase
		System.out.println("The Lowercase is "+ s.toLowerCase());
		
		//Character at specific index
		System.out.println("Character at 3rd index is "+ s.charAt(3));
		
		//Index of specific Character
		System.out.println("index of i is "+ s.indexOf("i"));
		
		//The last index of
		System.out.println("The last index of i is "+ s1.lastIndexOf("i"));
		System.out.println("==============================================================");
		
		//Trim
		System.out.println("before trim:- "+ s2);
		System.out.println("after trim:- "+ s2.trim());
	}

}
