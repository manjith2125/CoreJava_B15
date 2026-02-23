package Features;

public interface HR {
	
	public String company();
	
	public default String role() {
		return "Human Resources...";
		
	}
	
	public default void attendance() {
		System.out.println("HR team attendance must be 75%..");
	}
	
	public static void location() {
		System.out.println("Banglore...");
	}

}
