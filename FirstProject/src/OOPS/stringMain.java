package OOPS;
public class stringMain {
	
	public static void main(String[] args) {
		
		string op1=new string();
		op1.str1();
		
		string op2=new string();
		boolean b=op2.str2();
		System.out.println("Equals Ingonre case:- "+b);
		
		string op3=new string();
		op3.str3("india");
		op3.str3("maHaraShtra");
		
		string op4=new string();
		String k=op4.str4("WE LOVE INDIA");
		System.out.println("String c lowercase:- "+ k);
	}

}
