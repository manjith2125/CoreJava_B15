package Oops;

public class Parent extends GrandParent {
	
	public void Bike() {
		System.out.println("Parent Bike..");
	}
	
	public void House() {
		System.out.println("Parent House..");
	}

	public static void main(String[] args) {
		
	
		Parent p1=new Parent();
		
		p1.Bike();
		p1.House();
		p1.Cycle();
		p1.Hammer();
		
		
	}
}
