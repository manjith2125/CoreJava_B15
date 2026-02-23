package collect;

public class CompareTest {
	
	public static void main(String[] args) {
		Integer a=10;
		Integer b=20;
		Integer c=10;
		
		System.out.println(a.compareTo(b)); 		// If compared values is LESS THAN comparable value it will give (-1)... --Backward or Previous position
		
		System.out.println(b.compareTo(a));			// If compared values is GREATER THAN comparable value it will give (+1).. == Forward or Next positon 
		
		System.out.println(c.compareTo(a));			 // If compared values is EQUAL TO comparable value it will give (0)..
		
		
	}

}
