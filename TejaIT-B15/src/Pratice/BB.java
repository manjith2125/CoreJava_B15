package Pratice;
// Child Class
public class BB extends AA{
	@Override
	
	public void m1() {
		System.out.println("Child class m1 method");
	}
	@Override
	public void m2() { 		// In Inheritance we cant use Private method for Overriding
		System.out.println("child class m2 method");
	}
	@Override
	public void m3() {		//In Inheritance we cant use Final  method for Overriding
		System.out.println("child class m3 method");
	}
	@Override
	
	public void m4() {			//In Inheritance we cant use "Static" method for Overriding...
		System.out.println("child class m4 method");
	}
	


}
