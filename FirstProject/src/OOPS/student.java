package OOPS;
public class student {
	
	int studId;
	String studName;
	static char studDiv='A';
	
	public void display() {
		System.out.println("Student Id:- "+ studId);
		System.out.println("Student Name:- "+ studName);
		System.out.println("Student Division:- "+ studDiv);
	}
	
	public static void main(String[] args) {
		System.out.println("************ Student 1 *************");
		student Stud1=new student();
		Stud1.studId=101;
		Stud1.studName="ABC";
		Stud1.display();
		
		System.out.println("************ Student 2 *************");
		student Stud2=new student();
		Stud2.studId=102;
		Stud2.studName="DEF";
		Stud2.display();
		
		System.out.println("************ Student 3 *************");
		student Stud3=new student();
		Stud3.studId=103;
		Stud3.studName="XYZ";
		Stud3.display();
		
		studDiv='D';
		System.out.println("************ Student 4 *************");
		student Stud4=new student();
		Stud4.studId=104;
		Stud4.studName="COP";
		Stud4.display();
		
		System.out.println("************ Student 5 *************");
		student Stud5=new student();
		Stud5.studId=105;
		Stud5.studName="HIK";
		Stud5.display();
		
		System.out.println("************ Student 6 *************");
		student Stud6=new student();
		Stud6.studId=106;
		Stud6.studName="UHJ";
		Stud6.display();
		
		studDiv='E';
		System.out.println("************ Student 7 *************");
		student Stud7=new student();
		Stud7.studId=107;
		Stud7.studName="JHV";
		Stud7.display();
		
		System.out.println("************ Student 8 *************");
		student Stud8=new student();
		Stud8.studId=108;
		Stud8.studName="PLM";
		Stud8.display();
		
		System.out.println("************ Student 9 *************");
		student Stud9=new student();
		Stud9.studId=109;
		Stud9.studName="TGB";
		Stud9.display();
		
		System.out.println("************ Student 10 *************");
		student Stud10=new student();
		Stud10.studId=110;
		Stud10.studName="QWS";
		Stud10.display();
	}
	
	
}
