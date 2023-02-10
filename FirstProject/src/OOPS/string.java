package OOPS;

public class string {
	
	String s1="Supriya";
	String s2="SupriyA";
	
	public void str1() {
		System.out.println("Equals:- "+ s1.equals(s2));
	}
	
	public boolean str2() {
		return(s1.equalsIgnoreCase(s2));
	}
	
	public void str3(String a) {
		System.out.println("String a Uppercase:- "+ a.toUpperCase());
	}
	
	public String str4(String c) {
		return(c.toLowerCase());
	}

}
