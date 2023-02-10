package AbstractKeyword;

public class BasicMain extends BasicCC {
	
	public int m4() {
		return (o-p);
	}

	public static void main(String[] args) {
		
		BasicMain obj=new BasicMain();
		obj.m1(12,4);
		
		double f=obj.m2(21,5.25);
		System.out.println("Subtraction of x&y:-"+f);
		
		obj.m3();
		
		int d=obj.m4();
		System.out.println("Subtraction of o&p:-"+d);
	}
	
}
