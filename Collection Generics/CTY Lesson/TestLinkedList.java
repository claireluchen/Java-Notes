package Lesson;

import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> quote = new LinkedList<String>();
		//adding elements in order
		quote.add("A stitch in time saves nine");
		quote.add("A penny saved in a penny earned");
		//add specifying the index
		quote.add(0, "Got Java?");
		//adds at the end of the list
		quote.add("Today is the first day of the rest of your life");
		//sets the object at the specified index
		quote.set(0, "Yes I got Java");
			
		//remove the last element
		quote.removeLast();
		//remove the first element
		quote.removeFirst();
		//get the first element
		quote.getFirst();
		//add first element
		quote.addFirst("first");
		
		System.out.println(quote.size()); //3
		String firstElement = quote.getFirst();
		System.out.println(firstElement); //first
		for (String element : quote) { //collection based for loop
			System.out.println(element);
		}
		/*
		first 
		A stitch in time saves nine
		A penny saved in a penny earned
		 */
		
		
	}

}
