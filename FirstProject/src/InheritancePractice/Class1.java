package InheritancePractice;

public class Class1 extends Parenttt1 {
	
	String email="supriya.kokane98@gmail.com";
	long mobileno=4563217895l;
	
	public void c1() {
		System.out.println("Email:- "+email);
		System.out.println("MobileNo:- "+mobileno);
	}
	
	public static void main(String[] args) {
		Class1 ob1=new Class1();
		ob1.p1();
		ob1.c1();		
	}

}
