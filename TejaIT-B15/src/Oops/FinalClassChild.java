package Oops;

public class FinalClassChild extends FinalclassParent {
	
	final   int id=25;
	
	@Override
	
	public void m1() {
		System.out.println("This is child  m1 method..");
		
	}
	
	public void m2() {
		
		
		System.out.println("This is Child m2 method.... ");
		System.out.println(id);
		
		
	}
	
	public static void main(String[] args) {
		
		FinalClassChild Cs1=new FinalClassChild();
		
		Cs1.m1();
		Cs1.m2();
		
		
	}

}
