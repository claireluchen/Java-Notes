package SetsMaps;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
Use a TreeMap to store an entry consisting of a word and its count
For each word, check whether it is already a key in the map.
If not, add an entry to the map with the word as the key and value 1.
Otherwise, increase the value for the word (key) by 1 in the map
Assume the words are case insensitive
 */
public class CountOccurrenceWords {

	public static void main(String[] args) {
		//read file
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		in.close();
		
		//create a TreeMap, words order alphabetically, to hold word as key, count as value
		Map<String, Integer> map = new TreeMap<>();
		
		String[] words = text.split("[\\s+\\p{P}]"); // \s = whitespace, \p{P} = punctuation
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			if(key.length() > 0) {
				if (!map.containsKey(key)) {
					//add a new entry
					map.put(key, 1);
				}else {
					//add 1 to the count
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
			
		}
		
		//display key and value for each entry
		map.forEach((k, v) -> System.out.println(k + "\t" + v));
			
	}

}
