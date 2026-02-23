package PracticeSet;

public class InterfacePractice extends Thread {
	
	@Override
	
	public void run() {
		System.out.println("This is override.");
		
		
	}
	public static void main(String[] args) {
		InterfacePractice ip=new InterfacePractice();
		Thread tt=new Thread(ip);
		tt.start();
		
	}

}
