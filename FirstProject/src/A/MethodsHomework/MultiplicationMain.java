package A.MethodsHomework;

public class MultiplicationMain {
	
	public static void main(String[] args) {
		
		Multiplication ob1=new Multiplication();
		ob1.Mul1();
		
		Multiplication ob2=new Multiplication();
		ob2.Mul2(21, 6);
		ob2.Mul2(13, 8);
		
		Multiplication ob3=new Multiplication();
		int e=ob3.Mul3();
		System.out.println("Multiplication of x&y:- "+e);
		
		Multiplication ob4=new Multiplication();
		int f=ob4.Mul4(8, 11);
		System.out.println("Multiplication of a&b:- "+f);
	}

}
