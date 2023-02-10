package LastFinalPractice;

public class practice1 {
	
	public static void main(String[] args) {
		
	    int a[]= {5,2,10,4,20,-3,1,7};
	    int min=a[0];
	    int max=a[0];
	    
	    for(int i=0;i<=a.length-1;i++) {
	    	if(min>a[i]) {
	    		min=a[i];
	    	}
	    }
	    
	    for(int j=0;j<=a.length-1;j++) {
	    	if(max<a[j]) {
	    		max=a[j];
	    	}
	    }
	    System.out.println("min="+min);
	    System.out.println("max="+max);
	}

}
