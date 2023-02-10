package VelocityBatch;

public class multidimensinalArray {

	public static void main(String[] args) {
		
		int a[][]= new int [4][2];
		
		a[0][0]=10;
		a[0][1]=21;
		
		a[1][0]=25;
		a[1][1]=33;
		
		a[2][0]=30;
		a[2][1]=12;
		
		a[3][0]=45;
		a[3][1]=36;
		
		System.out.println("Total number of rows in an array:- "+a.length);
		System.out.println("Total number of columns in an array:- "+a[1].length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+ " ");
			}System.out.println();
		}
		
		
//		int a[][]= new int[3][3];
//		
//		a[0][0]=10;
//		a[0][1]=40;
//		a[0][2]=70;
//		
//		a[1][0]=20;
//		a[1][1]=50;
//		a[1][2]=80;
//		
//		a[2][0]=30;
//		a[2][1]=60;
//		a[2][2]=90;
//		
//		System.out.println("Total number of rows in an array:- "+a.length);
//		System.out.println("Total number of columns in an array:- "+a[1].length);
//		
//		System.out.println("The value present at row 2 column 1:- " + a[2][1]);
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.print(a[i][j]+" ");
//			}System.out.println();
//		}
	    
	}
}
