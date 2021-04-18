package SetsMaps;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		//create a hash set
		Set<String> set = new HashSet<>();
		set.add("bbb");
		set.add("aaa");
		set.add("ddd");
		set.add("ccc");
		set.add("aaa");
		
		//create tree set
		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println(treeSet); //sorted, [aaa, bbb, ccc, ddd]
		
		//use methods in SortedSet interface
		System.out.println(treeSet.first()); //first element, aaa
		System.out.println(treeSet.last()); //last element, ddd
		System.out.println(treeSet.headSet("ccc")); //[aaa, bbb]
		System.out.println(treeSet.tailSet("ccc")); //[ccc, ddd]
		
		//use methods in NavigableSet interface
		System.out.println(treeSet.lower("ccc")); //bbb
		System.out.println(treeSet.higher("ccc")); //ddd
		System.out.println(treeSet.floor("ccc")); //ccc
		System.out.println(treeSet.ceiling("ccc")); //ccc
		treeSet.pollFirst(); //removes and returns first element
		treeSet.pollLast(); //removes and returns last element
		System.out.println(treeSet); //[bbb, ccc]
		
		
	}

}
