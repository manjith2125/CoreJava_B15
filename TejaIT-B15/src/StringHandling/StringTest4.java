package StringHandling;

public class StringTest4 {
	
	public static void main(String[] args) {
		
		String str=new String("Java");
		System.out.println(str);
		
		StringBuffer sb=new StringBuffer("Java");   // Class 1.0
		System.out.println(sb);
		
		
		StringBuilder sbu=new StringBuilder("Java"); // Class 1.5 
		System.out.println(sbu);
		
		// All are working as same..
	}

}
