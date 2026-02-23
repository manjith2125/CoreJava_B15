package Multi;
// Here we are learning "MULTI - THREADING" Concept...
public class Airtel extends Thread { 	// before starting the code do EXTENDS WITH THREAD CLASS , or with RUNNABLE INTERFACE then only gp for rest
//MULTI THREADING..
	@Override
	public void run() { 		// must overide the RUN Method..
		System.out.println("Run method...");
	}
	public static void main(String[] args) {
		Airtel a1=new Airtel(); 	// We have to create object of our custom method..
		
		//a1.run(); 	// we can call but its not actually method to call the RUN method using THREADS.. it has to call AUTOMATICALLY
						// So wt to do is Create object with Thread Class..
		Thread t1=new Thread(a1); 	// After creating object with THREAD CLASS call the  our main object vairable in THREAD OBJECT (a1)..
				// which means we are passing our custom object reference into THREAD OBJECT.. 
				t1.start();		// To strat the thread we need to use START() METHOD from Thread class or Thread constructor.. 
								// Now this START () METHOD will call the RUN() Method direct directly.. 	
								// not by our manual ''a1.run(); ''
				
				
		
		
	}
}

//thread --- one ofatr othrer ... sysn.. thread saferty
//multi -- all yaskk at a time .. Asyn .. no thrads sadsrrfy ...
