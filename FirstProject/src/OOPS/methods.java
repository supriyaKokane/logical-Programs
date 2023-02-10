package OOPS;

public class methods {
	
	public static void m1() {
		System.out.println("This is static method m1");
	}
	
	public static void m2() {
		System.out.println("This is static method m2");
	}
	
	public void m3() {
		System.out.println("This is non static method m3");
	}
	public void m4() {
		System.out.println("This is non static method m4");
	}
	
	public static void main(String[] args) {
		 
		//Calling for Static method
		methods.m1();
		methods.m2();
		
		//Calling for Non static method
		methods s=new methods();    //Object Creation
		
		s.m3();
		s.m4();
	}

}
