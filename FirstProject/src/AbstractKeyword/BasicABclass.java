package AbstractKeyword;

public abstract class BasicABclass {
    int o=55;
    int p=10;
    
	public void m1(int a,int b) {
		System.out.println("Addition of a&b:-"+(a+b));
	}
	
	public double m2(int x,double y) {
		return(x-y);
	}
	
	abstract public void m3();
	abstract public int m4();
}
