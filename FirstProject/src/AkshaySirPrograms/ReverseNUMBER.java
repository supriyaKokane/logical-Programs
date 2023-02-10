package AkshaySirPrograms;

public class ReverseNUMBER {

	public static void main(String[] args) {
		
		int num=4564899;
		int rev=0;
		
		for(int i=num;i>0;i=i/10) {
			int a=i%10;
			rev=rev*10+a;
		}
		System.out.println(rev);
		
		if(num==rev) {
			System.out.println("Given number is palindrome");
		}else
			System.out.println("Given number is not palindrome");
	}
}
