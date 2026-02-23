package except;

public class ErrorTest {
	
	//StackOverflowError
	public void m1() {
		System.out.println("This is m1 method");
		m2(); // Here instead of calling method m2 from object we are calling it from method m1.. 
		
	}
	public void m2() {
		System.out.println("This is m2 method");
		m3(); 	//	Here instead of calling method m3 from object we are calling it from method m2..
		
	}
	public void m3() {
		System.out.println("This is m3 method");
		//m1();  // we can call but .. according to the code here it will create a never ending loop of execution ....
				// That kind of looping error is called as STATIC OVERFLOW ERROR.. 
				// THIS IS WT WE WANT TO TEST HERE IN THIS CODE 
	}
	public static void main(String[] args) {
	ErrorTest et=new ErrorTest();
	et.m1();
	
	}

}
