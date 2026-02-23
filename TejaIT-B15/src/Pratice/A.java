package Pratice;
// Child class
public class A extends B {
	
	public void Car() {
		System.out.println("A class child Car...");
	}
	
	public void Bike() {
		
		System.out.println("A Class childs Bike...");
	}
	
	public static void main(String[] args) {
		
		A a=new A();
		
		a.Car();
		a.Bike();
		
		a.car();
		a.house();
		
		System.out.println("=========================");
		

		B b=new B();
		
		b.car();
		b.house();
		
		System.out.println("====================");
		
		// till here everything seems normal ..
		
		
		B  b2=new A();
		
		b2.car();
		b2.house();
		
		//b2.bike();
		
	}

}
