package Lesson;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> quote = new ArrayList<String>();
		//adding elements in order
		quote.add("A stitch in time saves nine");
		quote.add("A penny saved in a penny earned");
		//add specifying the index
		quote.add(0, "Got Java?");
		//adds at the end of the list
		quote.add("Today is the first day of the rest of your life");
		//sets the object at the specified index
		quote.set(0, "Yes I got Java");
		//remove the object/element at the index
		quote.remove(3);
		
		System.out.println(quote.size()); //3
		for (int i = 0; i < quote.size(); i++) {
			System.out.println(quote.get(i));
		}
		/*
		Yes I got Java
		A stitch in time saves nine
		A penny saved in a penny earned
		 */
		
		ArrayList<Integer> num = new ArrayList<Integer>(); //using Integer wrapper class for primitive int type
		num.add(32);
		num.add(110);
		num.clear(); //clear the elements in the list
		System.out.println(num);
		if (num.isEmpty()) { //testing whether it's empty
			System.out.println("The list is empty");
		}else {
			num.forEach(e -> System.out.println(e));
		}
		
	}

}
