package Features;

public class Department implements HR, TeamLead {

	@Override
	public String company() {
		
		return "Deloite";
	}

	@Override
	public String role() {
		
		return TeamLead.super.role();
	}
	public static void main(String[] args) {
		
		Department dp=new Department();
	   System.out.println(dp.company());	
		System.out.println(dp.role());
		HR.location();
	Deprecated t2=()-> deloite;
		
		
	}

}
