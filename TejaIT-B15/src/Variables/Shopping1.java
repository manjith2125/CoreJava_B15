package Variables;

public class Shopping1 {
	// Methods are used for writing Logic in short programs 
	public int mobiles() {
		int Apple=2500;
		int Samsung=2000;				// ADDITION LOGIC
		int Total=Apple+Samsung;
		return Total;
	}
	public int Fashion() {
		 
		int Tshirt=1000;
		int Jeans=1500;
		int Total=Tshirt+Jeans;
		return Total;
	}
	
	public static void main(String[] args) {
		
		Shopping1 s1=new Shopping1();
	
		int mobilebill=s1.mobiles();
		int FashionBill=s1.Fashion();
		int FinalBill=mobilebill+FashionBill;
		
		//System.out.println(s1.mobiles());
		//System.out.println(s1.Fashion());
		
		
		System.out.println("Total Mobile Bill:: "+mobilebill);
		System.out.println("Total Fshionbill::"+FashionBill);
		System.out.println("All Bill::"+FinalBill);
		
	}

}
