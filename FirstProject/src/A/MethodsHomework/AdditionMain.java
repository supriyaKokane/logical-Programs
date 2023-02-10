package A.MethodsHomework;

public class AdditionMain {
	
	public static void main(String[] args) {
		
		Addition ob1=new Addition();
		ob1.Add1();
		
		Addition ob2=new Addition();
		int e=ob2.Add2();
		System.out.println("Addition of x&y:- "+ e);
		
		Addition ob3=new Addition();
		ob3.Add3(5, 8);
		ob3.Add3(6, 7);
		
		Addition ob4=new Addition();
		int f=ob4.Add4(21, 16);
		System.out.println("Addition of c&d:- "+ f);
	}

}
