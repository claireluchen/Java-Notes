package Collection;

import java.util.Collections;
import java.util.PriorityQueue;

/*
By default, the priority queue orders its elements according to their natural ordering using Comparable. 
The element with the least value is assigned the highest priority, and thus is removed from the queue first. 
If there are several elements with the same highest priority, the tie is broken arbitrarily
 */
public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>(); //a default queue
		//inserts an element
		queue1.offer("ddd");
		queue1.offer("ccc");
		queue1.offer("aaa");
		queue1.offer("bbb");
		System.out.println("Priority queue using Comparable: ");
		while (queue1.size() > 0) {
			System.out.print(queue1.remove() + " "); //aaa bbb ccc ddd 
		}
		
		PriorityQueue<String> queue2 = new PriorityQueue<>(4, Collections.reverseOrder()); //a queue with comparator
		queue2.offer("ddd");
		queue2.offer("ccc");
		queue2.offer("aaa");
		queue2.offer("bbb");
		System.out.println("\nPriority queue using Comparator: ");
		//removed from the queue in decreasing order
		while(queue2.size() > 0) {
			System.out.print(queue2.remove() + " "); //ddd ccc bbb aaa 
		}
		
	}

}
