package A.MethodsHomework;

public class SubtractionMain {
	
	public static void main(String[] args) {
		
		Subtraction ob1=new Subtraction();
		ob1.Sub1();
		
		Subtraction ob2=new Subtraction();
		ob2.Sub2(9, 8);
		ob2.Sub2(12, 8);
		
		Subtraction ob3=new Subtraction();
		int e=ob3.Sub3();
		System.out.println("Subtraction of x&y:- "+e);
		
		Subtraction ob4=new Subtraction();
		int f=ob4.Sub4(25,14);
		System.out.println("Subtration of c&d:- "+f);
	}

}
