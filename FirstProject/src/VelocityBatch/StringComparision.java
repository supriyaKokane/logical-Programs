package VelocityBatch;

public class StringComparision {

	public static void main(String[] args) {
		
		String s1="Velocity";
		String s2="VelocitY";
		String s3="Veloc";
		
		String s4="abcde";
		
		//Equals==== Case Sensitive
		System.out.println(s1.equals(s2));
		
		//equalsIgnoreCase==== Not case sensitive
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//Contains Method==== Case sensitive
		System.out.println(s1.contains(s3));
		
		//isempty
		System.out.println(s3.isEmpty());
		
		//concat
		System.out.println(s1.concat(s3));
		
		//startswith==== Case Sensitive
		System.out.println(s1.startsWith(s3));
		
		//endswith==== case sensitive
		System.out.println(s1.endsWith("city"));
		
		//replace
		System.out.println(s4.replace("abcde", "xyz@"));
		
		//substring
		System.out.println(s1.substring(3,6));
		
		//Split
		String s5="abc efg xyz";
		String words[]=s5.split(" ");
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
	}
}
