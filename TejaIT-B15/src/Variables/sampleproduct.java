package Variables;

public class sampleproduct {
	
	/* If we writing out side the method it is called Instance variable 
	 * see from 9 to 11
	 */
	
	int id=125;
	int NO=458;
	double Numb=125.55;
	
	// if we add Static to any thing that we wrote in the instance vairable it become static variable.. see 15
	
	static String name="One Stop Java";
	static int Number=1245;
	
	public static void main(String[] args) {     // METHOD 
		
		String Name="Manjith";
		double File=123.55;
		
		
		System.out.println(Name); // Inside the METHOD there is no issue with the recall the variable.
		System.out.println(File);
		/* thing not written inside the METHOD are called by their 
		 * CLASSNAME NAME=new CLASSNAME();  // NEW word is manditory to use  ( WE CALL THIS AS OBJECT)  
		 */
		
		sampleproduct Prod=new sampleproduct(); 		//( WE CALL THIS AS OBJECT)
		
		System.out.println(Prod.id);
		System.out.println(Prod.NO);
		System.out.println(Prod.Numb);
		
		/* if we want to call STATIC vairable that we are witing outside of METHOD 
		 *  syso crtl+space CLASSNAME.VAIRABLE NAME USED 
		 */
		
		System.out.println(sampleproduct.name);
		System.out.println(sampleproduct.Number);
		
		
	}

}
