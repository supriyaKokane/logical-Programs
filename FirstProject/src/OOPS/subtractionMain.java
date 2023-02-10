package OOPS;
public class subtractionMain {
	
	public static void main(String[] args) {
		
		subtraction cal1=new subtraction();
		cal1.sub1();
		
		subtraction cal2=new subtraction();
		double e= cal2.sub2();
		System.out.println("Case2 Subtraction:- "+e);
		
		subtraction cal3=new subtraction();
		cal3.sub3(2.456,12.84);
		cal3.sub3(18.25,2.454);
		
		subtraction cal4=new subtraction();
		double f=cal4.sub4(6.486,1.45);
		System.out.println("Case4 Subtraction:- "+f);
	}

}
