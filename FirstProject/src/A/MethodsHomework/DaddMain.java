package A.MethodsHomework;

public class DaddMain {
	
	public static void main(String[] args) {
		
		Dadd ob1=new Dadd();
		ob1.Add1();
		
		ob1.Add2(1.3f, 3.5f);
		
		float h=ob1.Add3();
		System.out.println("Addition of x&y:- "+h);
		
		float k=ob1.Add4(52.5f, 12.65f);
		System.out.println("Addition of a&b:- "+k);
				
  }
		
}
