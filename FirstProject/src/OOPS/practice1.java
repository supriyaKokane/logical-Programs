package OOPS;

public class practice1 {
	
	public static void main(String[] args) {
		
		//////////////////SQUARE PATTERN///////////////////
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		///////////////TRIANGLE PATTERN/////////////
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		for(int i=1;i<=5;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=============================");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
