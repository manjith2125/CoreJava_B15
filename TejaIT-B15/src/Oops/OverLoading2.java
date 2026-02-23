package Oops;

public class OverLoading2 {
	
	// Here we are having Single method and Single parameter but 
	// what we need to focus is though parameters are same but DATA TYPES MUST BE DIFFERENT 
	
	public void m1(int id) {
		System.out.println("integer parameter  "+id);
	}
	public void m1(String name) {
		System.out.println("String parameter  "+name);
	}
	public void m1(double value) {
		System.out.println("Double parameter  "+value);
	}

	
	public static void main(String[] args) {
		
		OverLoading2 ov2=new OverLoading2();
		
		ov2.m1(50);
		ov2.m1("Manjith");
		ov2.m1(150.55);
		
	}
}

