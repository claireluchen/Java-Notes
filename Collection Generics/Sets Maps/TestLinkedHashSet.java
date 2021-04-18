package SetsMaps;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		//create a linked hash set
		Set<String> set = new LinkedHashSet<>();
		//add strings to the set
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("aaa");
		System.out.println(set); //[aaa, bbb, ccc]
		
		//display the elements to upper case
		set.forEach(e -> System.out.print(e.toUpperCase() + " ")); //AAA BBB CCC 
		
	}

}
