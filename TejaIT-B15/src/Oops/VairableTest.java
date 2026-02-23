package Oops;

public class VairableTest extends VairableParent{

	int id=10;  // Instance Vairable
	
	public void test() {
		
		int id=20; 		// Local Vairable .... By default Java Gives priority to LOCAL VAIRABLE 
		
		System.out.println(id);		// so in line 11& 12 local vairable value is printed as 20.
		System.out.println(id);
		System.out.println(this.id);	// This is the separate way to call INSTANCE VAIRABLE ("THIS.ID")  printed as 10.
		
		System.out.println(super.id);	// printed as 35 from parent class (VairableParent)
						// Here we are calling something not in this class
						// firstly we need to extends them and later to call the value from parent class
						// we need to use ("SUPER.ID")
		
	}
	
	public static void main(String[] args) {
		VairableTest v1=new VairableTest();
		
		v1.test();
	}

}
