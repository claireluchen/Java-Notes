import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountLetters {
	private static int count = 0;
	
	public static void main(String[] args) {
		Random random = new Random();
		//create an array with 100 randomly generated lower case letters
		Object[] chars = random.ints(100, (int) 'a', (int) 'z' + 1).mapToObj(e -> (char)e).toArray();
		
		//display the lower case letters, 20 in a row
		Stream.of(chars).forEach(e -> {System.out.print(e + (++count % 20 == 0 ? "\n" : " "));});
	
		//reset count
		count = 0;
		//the occurrences of each letter
		//groupingBy(classifier, processor), where classifier = criteria for grouping, processor = how the elements are processed
		Stream.of(chars).collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).forEach((k, v) -> {System.out.print(k + " " + v + (++count % 10 == 0 ? "\n" : " "));});
		
		//count the occurrences of each letter in the string
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		count = 0;
		Stream.of(toCharacterArray(s.toCharArray())).filter(ch -> Character.isLetter(ch)).map(ch -> Character.toUpperCase(ch)).collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).forEach((k, v) -> {System.out.print(v + " " + k + (++count % 10 == 0 ? "\n" : " "));});
		in.close();	
	}
	
	//convert char[] array into Character[]
	public static Character[] toCharacterArray(char[] list) {
		Character[] result = new Character[list.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = list[i];
		}
		return result;
	}

}
