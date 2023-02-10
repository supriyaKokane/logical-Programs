package Ahomework;

public class String2Main {
	
	public static void main(String[] args) {
		
		String2 obj=new String2();
		obj.s1();
		
		obj.s2("sagar", "sagaR");
		
		String e=obj.s3();
		System.out.println("a to uppercase:- "+e);
		
		boolean f=obj.s4("velocity", "Velocity");
		System.out.println("v equals w:- "+f);
	}

}
