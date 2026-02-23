package Pratice;

public class Tesst3 {
	int i=200;	// instance variable 
	
	public void kill() {
		int i=500;
		
		int amount;
		amount=1220;
		System.out.println(amount);
		
	//	System.out.println(i);
		
		System.out.println(i);		// local vairable 
		
		System.out.println(this.i);	// Calling instance  Vairable again.. 
	}
	public static void kill2() {
		
		System.out.println("This is static variable... ");
	}
	
	public static void main(String[] args) {
		
		int i=300;
		Tesst3 t3=new Tesst3();
		
		t3.kill();
		Tesst3.kill2();
		
		
		
		
	}
}
