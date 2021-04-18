package SetsMaps;

import java.util.HashSet;
import java.util.Set;

//a set is an instance of Collection, which extends Iterable. All methods defined in Collection can be used for sets
public class TestCollectionMethodsHashSet {

	public static void main(String[] args) {
		//create set1
		Set<String> set1 = new HashSet<>();
		
		//add strings to set1
		set1.add("aaa");
		set1.add("bbb");
		set1.add("ccc");
		set1.add("ddd");
		set1.add("aaa");
		//number of elements in set1
		System.out.println(set1.size()); //4
		//delete a string from set1
		set1.remove("aaa");
		System.out.println(set1); //bbb ccc ddd
		
		//create set2
		Set<String> set2 = new HashSet<>();
		
		//add strings to set1
		set2.add("ddd");
		set2.add("eee");
		set2.add("fff");
		set2.add("ggg");
		set2.add("hhh");
		//contains method
		System.out.println(set2.contains("ddd")); //true
		
		//addAll
		set1.addAll(set2);
		System.out.println(set1); //bbb ccc ddd eee fff ggg hhh
		
		//removeAll
		set1.removeAll(set2);
		System.out.println(set1); //bbb ccc
		
		//retainAll
		set1.retainAll(set2);
		System.out.println(set1); //nothing, since all elements appeared in set2 are removed
		
	}

}
