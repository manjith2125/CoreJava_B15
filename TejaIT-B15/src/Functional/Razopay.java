package Functional;


@FunctionalInterface
public interface Razopay {
	
	
  public abstract String payment();
	
	public static void main(String[] args) {
		 Razopay r1=new Razopay() {
			
			@Override
			public String payment() {
				
				return "Payment Success...";
			}
		};
		
		String status=r1.payment();
		
		System.out.println(status);
		
	System.out.println("=====================================================");
		
		Razopay r2=()-> "Payment Success...";
			
		String status2=r2.payment();
		
		System.out.println(status2);
	}
	

}
