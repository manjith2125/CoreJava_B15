package collect;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
	
	
	public void queuetest() {
		Queue<Integer> q=new LinkedList<>();
		
		
					q.add(10);
					q.add(20);
					q.add(50);
					q.add(60);
					q.add(45);
					q.add(86);
					
					
					q.remove(); // This will Remove the fist added value .. 10;
					
					q.remove(); // This will remove the second added value ... 20;
					
					
					for(Integer i:q) {
						
						System.out.println(i);
					}
		
		
	}
	
	public void priorityqueuetest() {
		
		PriorityQueue<String> pq=new PriorityQueue<>();
		// In PRIOROTYQUEUE there is no guarenty that they will store in the same order as we given, it was inbuilty give by java in HEAP memory how to store..
		//And removing operation will be done based on how it stored the data in HEAP memory ...and then again it will change the order based on it convenace order ..
		
		pq.add("aa");
		pq.add("FF");
		pq.add("BB");
		pq.add("CC");
		pq.add("ff");
		
		pq.remove();
		pq.remove();
		
		for(String s:pq) {
			System.out.println(s);
		}
		
		
	}
	
		
	public static void main(String[] args) {
		QueueTest qt=new QueueTest();
		//qt.queuetest();
		qt.priorityqueuetest();
		
	}
			

}
