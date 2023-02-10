package AkshaySirPrograms;

public class RemoveCharFromString {
	
	public static void main(String[] args) {
		
		String s="su12pri34ya56";
		
		for(int i=0;i<s.length();i++) {
			for(char j='0';j<='9';j++) {
				if(s.charAt(i)==j) {
					System.out.print(s.charAt(i));
				}
			}
		}
	}

}
