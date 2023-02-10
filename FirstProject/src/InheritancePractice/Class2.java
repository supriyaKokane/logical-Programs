package InheritancePractice;

public class Class2 extends Parenttt1{
	
	String husname="Pravin Kokane";
	String designation="Proffesor";
	
	public void c2() {
		System.out.println("Spouse:- "+husname);
		System.out.println("Designation:- "+designation);
	}
	
	public static void main(String[] args) {
		 
		Class2 ob2=new Class2();
		ob2.p1();
		ob2.c2();
	}

}
