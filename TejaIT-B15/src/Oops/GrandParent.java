package Oops;
/* Here are linking the data from one class to other class 
 * To link the classess we need to use the command EXTENDS 
 * this is similar like  Propteries are being overed by legal HEIR 
 * but HEIRS properites cant be taken by younger  
 */
public class GrandParent {
	
	public void Cycle() {
		System.out.println("Grand Parent Cycel ");
	}
	public void Hammer() {
		System.out.println("Grand Parent Hammer..");
	}

	
	public static void main(String[] args) {
		
		GrandParent g1=new GrandParent();
		
		g1.Cycle();
		g1.Hammer();
	}
}
