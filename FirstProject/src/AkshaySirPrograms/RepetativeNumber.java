package AkshaySirPrograms;

import java.util.ArrayList;

public class RepetativeNumber {
	
	public static void main(String[] args) {
		
		String s="ssup212ggcvhg";
		
		char[] a=s.toCharArray();

				ArrayList<Character> ab = new ArrayList<Character>();
				for (int i = 0; i < a.length; i++) {
					int k = 0;
					if (!ab.contains(a[i])) {
						ab.add(a[i]);
						k++;
						for (int j = i + 1; j < a.length; j++) {
							if (a[i] == a[j]) {
								k++;
							}
						}
						System.out.println(a[i] + "  " + k);
						if (k == 1) {
							System.out.println(a[i] + " is unique number");
						}
					}
				}
		
	}

}
