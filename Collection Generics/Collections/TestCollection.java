package Collection;

import java.util.*;

public class TestCollection {

	public static void main(String[] args) {
		ArrayList<String> collection1 = new ArrayList<>(); //create a concrete collection object using ArrayList
		collection1.add("New York");
		collection1.add("Atlanta");
		collection1.add("Dallas");
		collection1.add("Madison");
		
		System.out.println("A list of cities in collection1: ");
		System.out.println(collection1); //whole collection
		
		collection1.remove("Dallas"); //remove an element
		System.out.println(collection1.size() + " cities are in collection1: "); //size
		
		ArrayList<String> collection2 = new ArrayList<>(); //create a concrete collection object using ArrayList
		collection2.add("Seattle");
		collection2.add("Portland");
		collection2.add("Los Angeles");
		collection2.add("Atlanta");
		
		System.out.println("A list of cities in collection2: ");
		System.out.println(collection2); //whole collection
		
		ArrayList<String> c1 = (ArrayList<String>)(collection1.clone()); //clone collection1
		c1.addAll(collection2); //addAll(c: Collection<? extends E>), now contains cities in collection1 and collection2
		System.out.println("Cities in collection1 or collection2: ");
		System.out.println(c1);
		
		c1 = (ArrayList<String>)(collection1.clone()); //clone collection1
		c1.retainAll(collection2); //retainAll(c: Collection<?>), only same element in c1 and collection2 are retained
		System.out.println("Cities in collection1 and collection2: ");
		System.out.println(c1);
		
		c1 = (ArrayList<String>)(collection1.clone()); //clone collection1
		c1.removeAll(collection2); //removeAll(c: Collection<?>), removes all elements from collection2 from this collection
		System.out.println("Cities in collection1, but not in 2: ");
		System.out.println(c1);
		
	}

}
