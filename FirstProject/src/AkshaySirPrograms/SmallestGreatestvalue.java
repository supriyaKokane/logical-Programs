package AkshaySirPrograms;

public class SmallestGreatestvalue {
	
	public static void main(String[] args) {
		
		int a[]= {10,3,45,84,-4,-75,76};
		int min=a[0];
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		for(int j=1;j<a.length;j++) {
			if(max<a[j]) {
				max=a[j];
			}
		}
		System.out.println("Smallest Array:- "+min);
		System.out.println("Greatest Array:- "+max);
	}

}
