package InheritancePractice;

public class Class3 extends Parenttt1 {
	
	long adhar=56136822363192l;
	long pancard=76412553217895l;
	
	public void c3() {
		System.out.println("Adhar Card:- "+adhar);
		System.out.println("Pan Card:- "+pancard);
	}
	
	public static void main(String[] args) {
		
		Class3 ob3=new Class3();
		ob3.p1();
		ob3.c3();		
	}

}
