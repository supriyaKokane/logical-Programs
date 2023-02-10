package VelocityBatch;

public class homework {

	public static void main(String[] args) {
	
		//sum of array
		int a[]= {3,7,5,9,6,2};
		int total=0;
		for(int i=0;i<a.length;i++)
		{
			total=a[i]+ total;
		}
		System.out.println("Sum of values in array is "+ total);
		System.out.println("==========================================");

		
		//find out specific number
		int z=5;
		for(int j=0;j<a.length;j++) {
			if(a[j]==z)
			{System.out.println("The number is present in an given array:- " + j);}
			else 
				System.out.println("please enter correct number");
		}
		System.out.println("==========================================");
		
		//find specific string in an array 
		
		String s[]=new String[3];
		 s[0]="Pune";
		 s[1]="Mumbai";
		 s[2]="USA";
		 
		 String s1="Mumbai";
		 
		 for(int k=0;k<s.length;k++) {
		 if(s[k]==s1)
		 {System.out.println("This string is present at index:- " + k);}
		 }
	}
}

