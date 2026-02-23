package Pratice;

public class Hindi extends CinemaLang {

	@Override
	public void Distributer() {
		
		System.out.println("Your Hindi movie ticket got conformed...");
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Hindi hi=new Hindi();
		
		hi.hindi();
		hi.Distributer();
		
	}

}
