package Collection;

import java.util.LinkedList;
import java.util.Queue;

/*
The LinkedList class implements the Deque interface, which extends the Queue interface. 
You can use LinkedList to create a queue. 
LinkedList is ideal for queue operations because it is efficient for inserting and removing elements from both ends of a list.
Deque supports element insertion and removal at both ends, short for double-ended queue
addFirst(e), removeFirst(), addLast(e), removeLast(), getFirst(), getLast() are defined in the Deque interface
 */
public class TestQueue {

	public static void main(String[] args) {
		//create a queue, first-in, first-out
		Queue<String> queue = new LinkedList<>();
		//inserts elements
		queue.offer("City 1"); 
		queue.offer("City 2");
		queue.offer("City 3");
		queue.offer("City 4");
		System.out.println(queue.element()); //City 1, retrieves the head of the queue, throws exception if the queue is empty
		System.out.println(queue.peek()); //City 1, retrieves the head of the queue, returns null if the queue is empty
		while (queue.size()/2 > 0) {
			System.out.print(queue.remove() + " "); //throws an exception if the queue is empty
			System.out.print(queue.poll() + " "); //returns null if the queue is empty
		} //City 1 City 2 City 3 City 4 
		
		
	}

}
