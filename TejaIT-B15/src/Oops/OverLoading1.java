package Oops;

public class OverLoading1 {
	
	// This is the way of method overwriting , we have single method but need to have different parameter inside single method 
	public void m1() {
		System.out.println("This is method m1..");
	}
	public void m1(int id) {
		System.out.println("This is method m1...id::"+id );
	}
	public void m1(int value,String name, double size) {
		System.out.println("This is method m1 ...value::"+value+"   name::"+name+"   size::"+size);
	}
	
	public static void main(String[] args) {
		
		OverLoading1 o1=new OverLoading1();
		o1.m1();
		o1.m1(50);
		o1.m1(12, "MANJITH", 125.55);
	}

}
