package AkshaySirPrograms;

public class RemoveNumbersFromString {
	
	public static void main(String[] args) {

	String s="su4pr87iya5";
	
	for(int i=0;i<s.length();i++) {
		for(char j='a';j<='z';j++){
			if(s.charAt(i)==j) {
				System.out.print(s.charAt(i));
			}
		}
	}
 
	}
}
