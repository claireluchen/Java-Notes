import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
The text is split into words using a whitespace \s or punctuation \p{P} as a delimiter
a stream is created for the words
filter is used to select non empty words
collect method groups the words by converting each into lower case and returns a TreeMap with words as key and their count as value
forEach method displays the key and its value
 */
public class CountOccurrenceOfWordsStream {

	public static void main(String[] args) {
		//count the occurrences of words in a text
		//get a sentence
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		Stream.of(str.split("[\\s+\\p{P}]")).parallel().filter(e -> e.length() > 0).collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting())).forEach((k, v) -> System.out.println(k + " " + v));
		in.close();
	}

}
