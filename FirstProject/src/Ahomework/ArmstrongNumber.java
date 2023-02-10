package Ahomework;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num=375;
		int a=num;
		int i=0;
		int j;
		
		while(num>0) {
			j=num%10;
			i=j*j*j+i;
			num=num/10;
		}
		System.out.println(i);
		
		if(a==i) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
  }

}
