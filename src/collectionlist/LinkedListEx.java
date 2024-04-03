package collectionlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
	    ll.add(10);
	    ll.addFirst(23);
	    ll.add(6);
	    ll.offerLast(50);
	    ll.addLast(40);
	    System.out.println("Element in Lined List : "+ll);
	    System.out.println("Element in peek : "+ll.peek());
	    System.out.println("Element in Lined List : "+ll);
	    System.out.println("Element in pollfirst(remove first ) : "+ll.pollFirst());
	    System.out.println("Element in Linked List : "+ll);
	    System.out.println("Element in Linked List using Iterator :");
	    Iterator<Integer> iter = ll.iterator();
	    while (iter.hasNext()) {
	      int i = iter.next();
	       System.out.println(i);
	    }

	}

}
