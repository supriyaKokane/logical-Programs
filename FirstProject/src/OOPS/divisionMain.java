package OOPS;
public class divisionMain {
	
	public static void main(String[] args) {
		
		division cal1=new division();
		cal1.div1();
		
		division cal2=new division();
		double e=cal2.div2();
		System.out.println("Case2 Division:- "+ e);
		
		division cal3=new division();
		cal3.div3(5.2,3.4);
		cal3.div3(9.8,4.2);
		
		division cal4=new division();
		double f=cal4.div4(7.32,5.01);
		System.out.println("Case4 Division:- "+f);
		
	}

}
