package StringHandling;

public class StringTest2 {
	
	public static void main(String[] args) {
		
		String s="Manjith";
		
		System.out.println(s.charAt(2)); // This will read the 2nd char ..
		
		System.out.println(s.compareTo(s)); // This will compare wheather both are equal or not..
		
		System.out.println(s.concat(" No One Stop"));// This will add to the first string..
		
		System.out.println(s.contains("jh"));// This will compare wheather jh is present in orginak string or not..
		
		System.out.println(s.endsWith("th")); // it orginal string ends with th it will print true..
		
		System.out.println(s.startsWith("Ma")); // it orginal string start  with Ma it will print true..
		
		System.out.println(s.equals("Manjith")); // it will print true or false.. but is CASE sensitive
		
		System.out.println(s.equalsIgnoreCase("MANJITH"));  // it will print true or false.. but is  NOT CASE sensitive..
		
		
		System.out.println(s.hashCode());
		
		System.out.println(s.indent(4)); // it will gave space before the string of 4 letters...
		
		System.out.println(s.indexOf('a')); // This will read the letters.. ..
		
		System.out.println(s.isBlank()); // check weather sting is blank or not..
		
		System.out.println(s.isEmpty()); // Check weather string is empty or not..
		
		System.out.println(s.length()); // Read for string length.. 7
		
		System.out.println(s.replace("i", "n"));  // This will replace I with N ..
		
		
		
		
		char[] charArr=s.toCharArray();
		System.out.println(charArr);
		
		System.out.println(s.toLowerCase()); // Transfrom entire into lower case..
		
		System.out.println(s.toUpperCase()); // Transfrom entire into UPPER CASE..
		
		System.out.println("=======================================");
		
		
		String s2="Your Java Stop";
		
		String[] starr=s2.split(" ");
		for (String words:starr) {
			
			System.out.println(words);
			
			
			
		}
		
		
		
		
		
		
		
	}

}
