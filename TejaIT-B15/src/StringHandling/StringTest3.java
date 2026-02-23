package StringHandling;

public class StringTest3 {
	
	public static void main(String[] args) {
		
		String s1="Teja";
		String s2="IT";
		String s3=s1+s2;
		System.out.println(s3);
		
		
		//String is a IMMUTABLE CLASS-- WE CANT MODIFY THE DATA... In the existing class...
		
		String s4="Teja IT";
		String s5=s4.concat("  Your Java Stop!"); // Storing  the contact data into a neew object n by calling with that object we can have out required concat..
		System.out.println(s4); // Since String is a immutable class, direct modifications wont be displaced or modified...
		System.out.println("========================");
		
		System.out.println(s5);
		
		
		
		
	}

}
