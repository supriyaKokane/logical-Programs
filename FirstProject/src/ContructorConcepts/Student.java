package ContructorConcepts;

public class Student {
	
	int rollno;
	String name;
	char grade;
	float percentage;
	
	Student(int rn,String nm,char gr,float per) {
		rollno=rn;
		name=nm;
		grade=gr;
		percentage=per;
	}
	
	public void display() {
		System.out.println("Rollno:- "+rollno);
		System.out.println("Name:- "+name);
		System.out.println("Grade:- "+grade);
		System.out.println("Percentage:- "+percentage);
	}
	

}
