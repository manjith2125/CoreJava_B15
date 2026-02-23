package StringHandling;

public class StringTest1 {
	
	public static void main(String[] args) {
		
		// SCP- Doesnt allow Duplicates objects..
		// Before creating a new objects in SCP , The objects will compare with .equals method..
		// If the same object available in SCP, new object wont create..
		//But in heap always create new object, it doesnt consider duplicates becz it wont compare with .equals..
		
		String s1=new String("JAVA");
		String s2="Teja";
		String s3=new String("JAVA");
		String s4="Teja";
		String s5="JAVA";
		String s6=new String("Teja");
		String s7="BHARATH";
		String s8="Teja";
		String s9=new String("Teja");
		
		//  == Compare the object references (Comparing "ADDRESS" ) ...
		
		System.out.println(s1==s2);// False
		System.out.println(s1==s3);// False..
		System.out.println(s1==s4);// False..
		System.out.println(s2==s4);// True..
		System.out.println(s4==s5); //False
		System.out.println(s6==s9); // False
		System.out.println(s5==s7);  //False
		System.out.println(s5==s8); // False
		System.out.println(s4==s8); // True
		
		
		System.out.println("=====================================");
		// .Equals compares the content. IT doesnt care about address , and memory location..
		
		System.out.println(s1.equals(s2)); // False
		System.out.println(s1.equals(s3)); // True
		System.out.println(s2.equals(s4)); // True
		System.out.println(s6.equals(s9)); // True
		

		
	}

}
