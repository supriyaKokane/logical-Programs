package OOPS;
public class multiplicationMain {
	
	public static void main(String[] args) {
		
		multiplication cal1=new multiplication();
		cal1.mul1();
		
		multiplication cal2=new multiplication();
		int e=cal2.mul2();
		System.out.println("Case2 Multiplication:- "+e);
		
		multiplication cal3=new multiplication();
		cal3.mul3(2,3);
		cal3.mul3(5,6);
		
		multiplication cal4=new multiplication();
		int f=cal4.mul4(6,2);
		System.out.println("Case4 Multiplication:- "+f);
		
	}

}
