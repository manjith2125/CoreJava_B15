package Oops;

public class Child extends Parent{
	
	public void Car() {
		System.out.println("Child Car..");
	}
	@Override
	public void Bike() {
		System.out.println("Child Bike..");
	}
	
	public void House() {
		System.out.println("Child House..");
	}
	public void supercar() {
		System.out.println("child super car...");
	}
	
	public static void main(String[] args) {
		
		Child c1=new Child();
		
		c1.Car();
		c1.Bike();
		c1.House();
		c1.supercar();
		c1.Bike();
		c1.House();
		c1.Hammer();
	}

}
