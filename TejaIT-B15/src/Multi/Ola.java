package Multi;

public class Ola extends Thread {
	@Override
	public void run() {
		// if we want specific method be called syncronically we can use take the help of synchronized (this)  keyword...
		
		synchronized (this) {
		for(int i=0;i<10;i++)
		{
			System.out.println("Thread ID  ::"+Thread.currentThread().getId()+"    i ::"+i);
		}
		
		}
		
		
		for(int j=11;j<=20;j++)
		{
			System.out.println("Thread ID  ::"+Thread.currentThread().getId()+"   j ::"+j);
		}
		
		
		for(int k=21;k<=30;k++)
		{
			System.out.println("Thread ID  ::"+Thread.currentThread().getId()+"   k ::"+k);
			
		}
		
		
	}

	
	
	public static void main(String[] args) {
		Ola ol=new Ola();
		Thread t1=new Thread(ol);
		
		t1.start(); // t1--21
		
		Thread t2=new Thread(ol);
		t2.start();		// t2--22..
		
	}
}
