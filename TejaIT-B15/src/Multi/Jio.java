package Multi;

public class Jio extends Thread{
	@Override
	public void run() {
		System.out.println("Run method.. ");
		
	}
	public static void main(String[] args) {
		Jio j=new Jio();
		//j.run();
		Thread tt=new Thread(j);
		tt.start();
	}

}
