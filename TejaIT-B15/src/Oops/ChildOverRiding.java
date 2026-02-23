package Oops;

public class ChildOverRiding extends ParentOverRiding {
	
	// Overriding is same like wt you have done in INHERTANCE , if child has same thing that available with parent, child wont
	// take it from parent , he take it from himself , which me here parent data is overriding 
	@Override
	public void m1() {
		System.out.println("This is m1 Child method");
	}
	
	
	// See here there is no over riding happening becxz to override 
	// rules are like Same Method, Same Paramater but Different "class"(ChildOverRiding and ParentOverRiding)...
	// In Above m1 method is common in both parent and child override classes so it is overriding.....
	
	//@Override----- See here its showing error after removing bars ..
	
	
	public void m2(int id) {
		System.out.println("This is m2 child method...id"+id);
	}
	

	public static void main(String[] args) {
		ChildOverRiding cov=new ChildOverRiding();
		
		cov.m1();
		cov.m2(15);
	}
}
