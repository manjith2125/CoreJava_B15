package Functional;
@FunctionalInterface
public interface TejaIT {
	
	public abstract String tagline(String val); // Abstarct method.. Abstarct  methods can be called in child class only.. 
												// Instead of that we can call by creating anynomus inner type ...
												// object open by closed curley braces can create this anynomus inner type .. 
	
	public static void main(String[] args) {
		
		TejaIT t1=new TejaIT() {   // Anynomus inner type 
			
			@Override
			public String tagline(String val) {
				
				return "Teja It".concat(" "+val);
				
			}
		};
		
		String tagline=t1.tagline("Your java stop!");
		
		System.out.println(tagline);
	
	System.out.println("============================================");
	
	// Lamda :: -> 
	
	
	
	TejaIT t2=val -> "Teja It".concat(" "+val);
	
	
	

	String tagline2=t2.tagline("Your java stop!");
	
	System.out.println(tagline2);
	
	}
}


	
	

	
	
	
	

	
	
	
	
	
	


