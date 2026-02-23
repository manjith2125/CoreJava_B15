package except;

public class FinakkyTest {
	//Either Exception getting or not Always FINAL block will execute no matter what..
	
	public void  m1() {
		// if no Airthmetic Errors in code first TRY BLOCK and FINALLY BLOCK will excute ..
		// Catch block will get skipped...
		
		try {
		int i=100;
		int j=2;
		int k=i+j;
		
		System.out.println(k);
		System.out.println("Try Block....");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Catch Block...");
		}finally {
			// Connection , Session, Files..
			System.out.println("Finally Block....");
		}
		
		
	}
	
	//======================================================================================
	
	public void  m2() {
		
		// if There is Error in Arithmetic Excution .. first CATCH BLOCK and FINALLY BLOCK 
		try {
			
			int i=100;
			int j=0;
			int k=i+j;
			
			System.out.println(k);
			System.out.println("Try Block....");
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Catch Block...");
		}finally {
			// Connection , Session, Files..
			System.out.println("Finally Block....");
		}
		
		
	}
	
	
	
	
public static void main(String[] args) {
	FinakkyTest ft=new FinakkyTest();
	
	//ft.m1();
	ft.m2();
	
	
}
}
