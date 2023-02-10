package ThisSuperKeyword;

public class classB extends classA {
	
	int y;
	
	public void m2(int x,int y) {
		super.x=x;
		this.y=y;
		System.out.println("Subtraction of x&y:- "+(x-y));
	}
	
	public static void main(String[] args) {
		classB obj1=new classB();
		obj1.m2(20,12);
		obj1.m1(10,25);
	}

}
