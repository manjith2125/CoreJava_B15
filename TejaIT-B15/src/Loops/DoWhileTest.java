package Loops;

public class DoWhileTest {
	// We use DO- WHILE when we need to exexute the condition atleast once even if the orginal conditon fails..
	// Even the conditon fails , it will excute atleast once...
	
	public static void main(String[] args) {
		 
		int i=0; 	// Initialization
		do {
			System.out.println(i); // execution
			i++;		// Increment
			
		}while(i<10); 	// Condition..
	}

}
// For for loop ... Initialization, condition , increment, execution..