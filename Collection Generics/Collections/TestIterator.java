package Collection;

import java.util.*;

public class TestIterator {

	public static void main(String[] args) {
		//create a concrete collection object using ArrayList. 
		//Can use any concrete class of Collection, such as HashSet and LinkedList
		ArrayList<String> collection = new ArrayList<>(); 
		collection.add("New York");
		collection.add("Atlanta");
		collection.add("Dallas");
		collection.add("Madison");
		
		Iterator<String> iterator = collection.iterator(); //iterator
		while(iterator.hasNext()) {
			//change to UpperCase when printing out, doesn't actually change the content in collection
			System.out.print(iterator.next().toUpperCase() + " "); //NEW YORK ATLANTA DALLAS MADISON 
		}		
		System.out.println();
		
		for (String element: collection) {
			collection.set(collection.indexOf(element), element.toUpperCase()); //change to upper case, doesn't reflect here
			System.out.print(element + " "); //New York Atlanta Dallas Madison 
		}
		System.out.println();
		
		for (String element: collection) {
			System.out.print(element + " "); //NEW YORK ATLANTA DALLAS MADISON 
		}
		System.out.println();

		collection.forEach(e -> collection.set(collection.indexOf(e), e.toLowerCase())); 
		collection.forEach(e -> System.out.print(e + " ")); //new york atlanta dallas madison
		System.out.println();
		
		for(String element: collection) {
			System.out.print(element.toLowerCase() + " "); //new york atlanta dallas madison
		}
		System.out.println();
		
		iterator = collection.listIterator(0); //move the iterator to index 0
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.print(str.substring(0, 1).toUpperCase() + str.substring(1, str.length()).toLowerCase() + " "); //prints out UpperCase first letter
			//New york Atlanta Dallas Madison
		}
		
	}

}
