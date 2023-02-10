package InheritancePractice;

public class Child extends Parent {
	
	int c=5;
	int d=10;
	public void m2() {
		System.out.println("Y= "+ (c+d));
	}
	public static void main(String[] args) {
		
		Child S=new Child();
		S.m1();
		S.m2();
	}
}
