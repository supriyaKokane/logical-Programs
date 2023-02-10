package OOPS;

public class MainMethod {
	
	public static void main(String[] args) {
		
		RegularMethod emp1=new RegularMethod();
		
		emp1.empid=101;
		emp1.empname="Supriya Kokane";
		emp1.empdept=3;
		emp1.empjob="Tester";
		emp1.empsal=45000.501;
		emp1.display();
		
		System.out.println("**************************************************");
		
		RegularMethod emp2=new RegularMethod();
		
		emp2.empid=102;
		emp2.empname="Shubhangi Patil";
		emp2.empdept=4;
		emp2.empjob="Developer";
		emp2.empsal=50000.45;
		emp2.display();
		
		System.out.println("**************************************************");
		
        RegularMethod emp3=new RegularMethod();
		
		emp3.empid=103;
		emp3.empname="Sagar Dhotre";
		emp3.empdept=5;
		emp3.empjob="GBT";
		emp3.empsal=60100.70;
		emp3.display();
		
	}

}
