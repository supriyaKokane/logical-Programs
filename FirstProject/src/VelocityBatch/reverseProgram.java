package VelocityBatch;

public class reverseProgram {
	
	public static void main(String[] args) {
	
	int num=12321;
	int reverse=0;
	
	for(int i=num;i>0;i=i/10) {
		int a=i%10;
		reverse=reverse*10+a;
	}
		System.out.println(reverse);
		
		if(num==reverse) {
			System.out.println("palindrome");
		}else
			System.out.println("not palindrome");
	}
}
