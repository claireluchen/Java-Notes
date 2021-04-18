package SetsMaps;

import java.util.HashSet;
import java.util.Set;

/*
The HashSet class is a concrete class that implements Set.
An empty hash set can be created using no-arg constructor, or an existing collection
By default, the initial capacity is 16, the load factor is 0.75.
A HashSet can be used to store duplicate-free elements. 
Objects added to a hash set need to implement the hashCode method, which is defined in the Object class. 
The hash codes of two objects must be the same if the two objects are equal. 
Two unequal objects may have the same hash code, but you should implement the hasCode method to avoid too many such cases. 
Most of the classes in the Java API implement the hashCode method. 
hashCode of the Integer class returns its int value, hashCode of the Character class returns the Unicode of the character.
You cannot update an element in hashset
 */
public class TestHashSet {

	public static void main(String[] args) {
		//create a hash set
		Set<String> set = new HashSet<>();
		
		//add strings to the set
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("aaa");
		System.out.println(set);
		
		//display the elements in the hash set, traverse elements
		for (String s: set) {
			System.out.print(s.toUpperCase() + " ");
		}
		System.out.println();
		
		//process the elements using a forEach method
		set.forEach(e -> System.out.print(e.substring(0, 1).toUpperCase() + e.substring(1, e.length())+ " "));
		System.out.println();
		
		
	}

}
