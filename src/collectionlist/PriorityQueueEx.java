package collectionlist;

import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        pq.add(8);  
        pq.add(6);  
        pq.add(4); 
        pq.add(2);  
        pq.add(12);  
        pq.add(10);
        pq.add(1);
        pq.add(50);
        
       System.out.println("Queue:"+pq);
       
        System.out.println("The min Priority Queue (natural ordering) contents:");
        Integer val = null;
        while( (val = pq.poll()) != null)
        {
            System.out.print(val + " ");
        }

	}

}
