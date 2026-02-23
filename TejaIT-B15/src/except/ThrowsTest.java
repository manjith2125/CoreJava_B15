package except;

public class ThrowsTest {
	// Throws Decleration will just pass the exception to the caller method... its not actually excepting its just pass to caller method..
	// it is not handling the exception ok...
	
	public void m1() throws InterruptedException {
		
		
		System.out.println("Printing numbers under m1 method");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
			Thread.sleep(2500);
			
			
			
		}
	}
	
	public void m2() throws InterruptedException {
		System.out.println("Printing numbers under m2 method...");
		
		m1();
		
	}
	
	public void m3() throws InterruptedException {
		System.out.println("Printing numbers m3 method....");
		m2();
		
	}
	public static void main(String[] args) throws InterruptedException {
		ThrowsTest tt=new ThrowsTest();
		tt.m1();
		tt.m2();
		tt.m3();
		
		
	}

}
