package Logical;

public class Tesst {
	
	public void m1(String str) {
		System.out.println("String  .."+str);
		
	}
public void m1(StringBuffer sbf) {
	System.out.println("String Bufferss ..."+sbf);
		
	}
public void m1(StringBuilder sbu ) {
	System.out.println("String Builder... "+sbu);
	
}
public static void main(String[] args) {
	Tesst t2=new Tesst();
//	t2.m1(null);  // AMBIGUITY error becz java is getting confused to call which method becz all methods here accept NULL values..
	
}
}
