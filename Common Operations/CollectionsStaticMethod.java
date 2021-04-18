
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollectionsStaticMethod {

	public static void main(String[] args) {
		//Sort the comparable elements in a list in its natural order with the compareTo method in the Comparable interface
		//specify a comparator to sort elements, the following code sorts strings in a list
		List<String> list = Arrays.asList("red", "green", "blue");
		Collections.sort(list);
		System.out.println(list); //[blue, green, red]
		
		//sort the list in descending order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list); //[red, green, blue]
		
		//binarySearch method to search for a key in a list
		//to use this method, the list must be sorted in increasing order
		//if the key is not in the list, the method returns -(insertion point + 1)
		//insertion point is where the item would fall in the list if it were present
		//the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key.
		List<Integer> list1 = Arrays.asList(2, 3, 7, 10, 11, 45, 50, 59, 60, 66);
		System.out.println("Index of 7: " + Collections.binarySearch(list1, 7)); //Index of 7: 2
		System.out.println("Index of 9: " + Collections.binarySearch(list1, 9)); //Index of 9: -4
		
		Collections.sort(list);
		System.out.println("Index of red: " + Collections.binarySearch(list, "red")); //Index of red: 2
		System.out.println("Index of tree: " + Collections.binarySearch(list, "tree")); //Index of tree: -4
		
		//use the reverse method to reverse the elements in the list
		Collections.reverse(list);
		System.out.println(list); //[blue, green, red]
		
		//use the shuffle(List) method to randomly reorder the elements in a list
		Collections.shuffle(list);
		System.out.println(list); //[green, blue, red]
		
		//use the shuffle(List, Random) method to randomly reorder the elements in a list with a specified Random object
		//using a specified Random object is useful to generate a list with identical sequences of elements for the same original list
		List<String> list2 = Arrays.asList("aaa", "bbb", "ccc", "ddd");
		List<String> list3 = Arrays.asList("aaa", "bbb", "ccc", "ddd");
		Collections.shuffle(list2, new Random(20));
		Collections.shuffle(list3, new Random(20));
		System.out.println(list2); //[ddd, aaa, bbb, ccc]
		System.out.println(list3); //[ddd, aaa, bbb, ccc]
		Collections.shuffle(list2);
		Collections.shuffle(list3);
		System.out.println(list2); //[bbb, aaa, ddd, ccc]
		System.out.println(list3); //[ddd, bbb, ccc, aaa]
		
		//use copy(det, src) method to copy all the elements from a source list to a destination list on the same index
		//performs shallow copy: only references of the elements from the source list are copied
		List<String> list4 = Arrays.asList("aaa", "bbb", "ccc", "ddd");
		List<String> list5 = new LinkedList<String>();
		list5.add("eee");
		list5.add("fff");
		Collections.copy(list4, list5); 
		System.out.println(list4); //[eee, fff, ccc, ddd]
		list5.add(0, "ggg");
		Collections.copy(list4, list5); 
		System.out.println(list4); //[ggg, eee, fff, ddd]
		
		//use nCopies(int n, Object o) method to create an immutable list that consists of n copies of the specified object
		//you cannot add, remove, update elements in the list. All elements have the same references
		//creates a list with five Calendar objects
		List<GregorianCalendar> list6 = Collections.nCopies(5, new GregorianCalendar());
		Calendar car = list6.get(0);
		System.out.println(car.getWeekYear()); //2020
		System.out.println(car.getTime()); //Sat May 16 11:59:51 EDT 2020
		
		//use the fill(List list, Object o) method to replace all the elements in the list with the specified element
		List<String> list7 = Arrays.asList("red", "green", "white");
		Collections.fill(list7, "black");
		System.out.println(list7); //[black, black, black]
		
		//use the max and min methods for finding the maximum and minimum elements in the collection
		//the elements must be comparable using the Comparable or Comparator interface
		Collection<String> collection = Arrays.asList("red", "green", "white");
		System.out.println(Collections.max(collection)); //use Comparable, white
		System.out.println(Collections.min(collection, Comparator.comparing(String::length))); //use Comparator, red
		
		//disjoint(collection1, collection2) returns true if the two collections have no elements in common
		Collection<String> collection1 = Arrays.asList("red", "green");
		Collection<String> collection2 = Arrays.asList("red", "yellow");
		Collection<String> collection3 = Arrays.asList("yellow", "white");
		System.out.println(Collections.disjoint(collection1, collection2)); //false
		System.out.println(Collections.disjoint(collection1, collection3)); //true
		
		//frequency(collection, element) method finds the number of occurrences of the element in the collection
		Collection<String> collection4 = Arrays.asList("yellow", "white", "yellow");
		System.out.println(Collections.frequency(collection4, "yellow")); //2
			
	}

}
