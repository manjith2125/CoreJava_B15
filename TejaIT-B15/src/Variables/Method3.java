package Variables;

public class Method3 {
	
	public void m1() {
		System.out.println("THIS IS METHOD M1");
	}
	public void m2(int id) {
		
		System.out.println("THIS IS METHOD M2.." +id);
	}
	public void m3(String name, double amt) {
		System.out.println("THIS IS METHOD M3.."+name+"   "+amt);
	}
	public static void main(String[] args) {
		Method3 m3=new Method3();
		
		m3.m1();
		m3.m2(20);
		m3.m3("MANJITH", 250.55);
	}
	

}


