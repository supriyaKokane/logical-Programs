package AkshaySirPrograms;

public class PrimeNumbers1to100 {
	
	public static void main(String[] args) {
		
	int num=100;
	
	for(int i=1;i<=num;i++ ) {
		int count=0;
		for(int j=1;j<=num;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.print(i+" ");
		}
	}
	}

}
