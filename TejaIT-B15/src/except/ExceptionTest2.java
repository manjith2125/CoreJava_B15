package except;

public class ExceptionTest2 {
	
	public static void main(String[] args) {
		try {		// One TRY BLOCK can associate with multiple CATCH BLOCSK..
		int i=100;
		int j=0;
		int k=i/j;
		
		System.out.println(k);
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) { 	// Different kind of exception array cant be handled .. becz here type is int but we gave ARRAY INDEX.. 
			e.printStackTrace();
			
		}catch (RuntimeException e) {			// not only arithmeticException we can also use runtimeException ,EXCEPTION ,  Throwablle
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}catch (Throwable e) {
			e.printStackTrace();
		}
		
		// we can not change  the order of exception becz we need to access from child first not from parent .. 
		// my way of remebering is father's wont have all to check.. so check from bottow to top..
	}

}
//Because order matters in exception handling.
//If you catch a parent type first, the child catch blocks become unreachable and the compiler throws an error.

//Debugging becomes harder if everything is swallowed by Throwable