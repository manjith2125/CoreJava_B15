package StringHandling;

public class Test2 {
	
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
	Test2 t2=new Test2();
	//t2.m1(null); // AMBIGUITY error becz java is getting confused to call which method becz all methods here accept NULL values...
	// So to call them separatly  by creating the  object.. 
	
	t2.m1("Java"); // This will call defalut STRING...
	
	StringBuffer sbf=new StringBuffer("String Buffer Value.."); // Object for STRING BUFFER...
	t2.m1(sbf);
	
	StringBuilder sbu=new StringBuilder("String Builder Value"); // Object for STRING BUILDER .. 
	
	t2.m1(sbu);
	
	
}
	

}
