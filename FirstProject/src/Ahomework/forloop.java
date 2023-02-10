package Ahomework;

public class forloop {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++) {
			for(int j=2;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				int d=2*i-1;
				System.out.print(d+" ");
			}
			System.out.println();
		}
		
		System.out.println("******************");
		
		for(char i='A';i<='D';i++) {
			for(char j='D';j>=i;j--) {
				System.out.print(" ");
			}
			for(char k='A';k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
