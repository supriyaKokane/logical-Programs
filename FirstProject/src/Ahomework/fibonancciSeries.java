package Ahomework;

public class fibonancciSeries {
	
	public static void main(String[] args) {
		
		int n=10;
		int a=0;
		int b=1;
		
		for(int i=1;i<=n;i++) {
			int c=a+b;
			a=b;
			b=c;
			
			System.out.println(c+ " ");
		}
	}

}
