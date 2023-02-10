package InheritancePractice;

public class OnePlus8 extends OnePlus7Pro{
	
	String Mbname="OnePlus";
	int modelno=8;
	int price=49999;
	
	public void OP8() {
		System.out.println("Brand:- "+Mbname);
		System.out.println("Model:- "+modelno);
		System.out.println("Price:- "+price);
	}
	
	public static void main(String[] args) {
		
		OnePlus8 ob= new OnePlus8();
		ob.OP7();
		ob.OP7P();
		ob.OP8();
	}

}
