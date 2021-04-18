package SetsMaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortByValue {

	public static void main(String[] args) {
	
		Map<String, Integer> map = new TreeMap<>();
		map.put("bbb", 3);
		map.put("ccc", 1);
		map.put("aaa", 2);
		//but the map into a list
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		//order the list according to their value, not the default key
		Collections.sort(entries, (entry1, entry2) -> {return entry1.getValue().compareTo(entry2.getValue());});
		
		for (Map.Entry<String, Integer> entry: entries) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		/*
		ccc	1
		aaa	2
		bbb	3
		 */
		
	}

}
