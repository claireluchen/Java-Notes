package Collection;

import java.util.*;

public class TestArrayLinkedList {

	public static void main(String[] args) {
		//array list
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0, 14); //add 14 to index 0 
		arrayList.add(3, 30); //add 30 to index 3 
		
		System.out.println("A list of integers in the array list: ");
//		System.out.println(arrayList); /[14, 1, 2, 30, 3, 1, 4]
		
		//linked list, constructed with arrayList elements
		LinkedList<Object> linkedList = new LinkedList<Object>(arrayList); 
		linkedList.add(1, "red"); //adds red to index 1
		linkedList.addFirst("green"); //adds green to first element
		linkedList.removeLast(); //removes the last element
		
		//use list iterator to display the linked list
		ListIterator<Object> listIterator = linkedList.listIterator(); //get a list iterator for elements in linkedList
		System.out.println("Display the linked list forward");
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + " "); //green 14 red 1 2 30 3 1 
		}
		System.out.println();
		
		System.out.println("Display the linked list backward");
		listIterator = linkedList.listIterator(linkedList.size()); //set the iterator to the last element
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + " "); //1 3 30 2 1 red 14 green 
		}
		System.out.println();
		
		//static asList method for creating a list from a variable-length list of arguments
		List<String> list1 = Arrays.asList("red", "green", "blue");
		list1.forEach(e -> System.out.print(e + " ")); //red green blue 
		
	}

}
