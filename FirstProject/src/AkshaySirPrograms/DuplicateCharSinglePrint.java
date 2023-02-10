package AkshaySirPrograms;

import java.util.HashSet;

public class DuplicateCharSinglePrint {
	
	public static void main(String[] args) {
		
		String s="aabccdfrrreeeg";
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0;i<=s.length()-1;i++) {
			hs.add(s.charAt(i));
		}
		System.out.println(hs);
		
		for(Character c:hs) {
			System.out.print(c);
		}
	}

}
