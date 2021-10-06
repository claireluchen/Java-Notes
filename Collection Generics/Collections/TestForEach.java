package Collection;

import java.util.*;

public class TestForEach {

	public static void main(String[] args) {
		//create an array list
		Collection<String> collection = new ArrayList<>();
		collection.add("New York");
		collection.add("Atlanta");
		collection.add("Dallas");
		collection.add("Madison");
		
		//forEach: new default method in the Iterable interface
		//the method takes an argument for specifying the action, which is an instance of a functional interface Consumer<? super E>
		//the Consumer interface defines the accept(E e) method for performing an action on the element e.
		//you can rewrite the preceding example using a forEach method
		//lambda expression
		collection.forEach(e -> System.out.print(e.toUpperCase() + " ")); //NEW YORK ATLANTA DALLAS MADISON 
		System.out.println();
		//the above lambda is the same as this anonymous inner class
		collection.forEach(
			new java.util.function.Consumer<String>() {
				public void accept(String e) {
					System.out.print(e.toUpperCase() + " "); //NEW YORK ATLANTA DALLAS MADISON
				}
			}
		);
		
		
	}

}
