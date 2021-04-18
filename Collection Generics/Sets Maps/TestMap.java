package SetsMaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


/*
Creates hash map, linked hash map, tree map for mapping students to ages.
key: student's name
value: student's age
 */
public class TestMap {

	public static void main(String[] args) {
		//create a HashMap
		Map<String, Integer> hashMap = new HashMap<>();
		//add entry
		hashMap.put("Smith", 30);
		hashMap.put("Bob", 20);
		hashMap.put("Anderson", 35);
		hashMap.put("Cook", 35);
		//display entries
		System.out.println(hashMap); //{Bob=20, Smith=30, Cook=35, Anderson=35}
		
		//create a TreeMap from the preceding HashMap
		Map<String, Integer> treeMap = new TreeMap<>(hashMap);
		//displaying entries in ascending order of key
		System.out.println(treeMap); //{Anderson=35, Bob=20, Cook=35, Smith=30}
		
		//TreeMap in reverse order
		Map<String, Integer> treeMap2 = new TreeMap<>(Collections.reverseOrder());
		treeMap2.put("Smith", 30);
		treeMap2.put("Bob", 20);
		treeMap2.put("Anderson", 35);
		treeMap2.put("Cook", 35);
		System.out.println(treeMap2);  //{Smith=30, Cook=35, Bob=20, Anderson=35}
		
		//create a LinkedHashMap, access-ordered linked hash map
		//LinkedHashMap<>(initialCapacity, loadFactor, true)
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
		linkedHashMap.put("Smith", 30);
		linkedHashMap.put("Bob", 20);
		linkedHashMap.put("Anderson", 35);
		linkedHashMap.put("Cook", 35);
		linkedHashMap.get("Bob"); //get the Cook's value
		//the most recently accessed element, Bob, is placed at the end of the list.
		System.out.println(linkedHashMap); //{Smith=30, Anderson=35, Cook=35, Bob=20}
		//display the keys in LinkedHashMap
		System.out.println(linkedHashMap.keySet()); //[Smith, Anderson, Cook, Bob]
		
		//display the entry with name and age, using forEach method
		linkedHashMap.forEach((name, age) -> System.out.print(name + ": " + age + " ")); //Smith: 30 Anderson: 35 Cook: 35 Bob: 20 
		
	}

}
