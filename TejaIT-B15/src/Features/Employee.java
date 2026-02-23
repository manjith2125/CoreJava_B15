package Features;

public class Employee implements HR, TeamLead {
//Diamond Problem.. -- for Backend Compatibility...
	@Override
	public String company() {
		return  "Infosys";
		
	}
	
	@Override
	public String role() {
		
		//return HR.super.role();
		return TeamLead.super.role();
	}

	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		System.out.println(e.company());
		System.out.println(e.role());
		
		e.attendance();
		HR.location();
		TeamLead.location();
		
		
	
		
	}
	

}
