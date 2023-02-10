package VelocityBatch;

public class singledimensional {

	public static void main(String[] args) {
		
		int a[]= new int[5];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		System.out.println("The size of an array:- "+ a.length);
		System.out.println("The value present at index 3:- "+a[3]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
			
			
	}
}
