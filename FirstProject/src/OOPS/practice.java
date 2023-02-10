package OOPS;

public class practice {
	
	public static void main(String[] args) {
		
	//ARRAY ADDITION
	int a[]=new int[5];
	a[0]=5;
	a[1]=4;
	a[2]=6;
	a[3]=5;
	a[4]=8;
	
	int total=0;
	for(int i=0;i<a.length;i++)
	{
		total=a[i]+ total;
	}
	System.out.println("Sum of values in array is "+ total);
		
		
	}
}
