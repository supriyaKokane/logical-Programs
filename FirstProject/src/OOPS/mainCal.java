package OOPS;

public class mainCal {
	
	public static void main(String[] args) {
		
		calculations cal1=new calculations();
		cal1.Add1();
		
		calculations cal2=new calculations();
		int e=cal2.Add2();
		System.out.println("Case2 Addition:- "+e);
		
		calculations cal3=new calculations();
		cal3.Add3(2,3);
		cal3.Add3(5,6);
		
		calculations cal4=new calculations();
		int f=cal4.Add4(12,5);
				System.out.println("Case4 Addtion:- "+f);
		
	}

}
