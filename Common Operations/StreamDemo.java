import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
	private static int count = 0;
	private static int i = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		double[] numbers = new double[in.nextInt()]; //create an array to store the items
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = in.nextDouble();
		}
		
		//get average
		double average = DoubleStream.of(numbers).average().getAsDouble();
		System.out.println(average);
		//count the number of elements above average
		System.out.println(DoubleStream.of(numbers).filter(e -> e > average).count());
		
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
		
		//reset count
		count = 0;
		//the occurrences of each letter
		//groupingBy(classifier, processor), where classifier = criteria for grouping, processor = how the elements are processed
		Stream.of(chars).collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).forEach((k, v) -> {System.out.print(k + " " + v + (++count % 10 == 0 ? "\n" : " "));});
				
		//count the occurrences of each letter in the string
		String s = in.nextLine();
		count = 0;
		Stream.of(toCharacterArray(s.toCharArray())).filter(ch -> Character.isLetter(ch)).map(ch -> Character.toUpperCase(ch)).collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).forEach((k, v) -> {System.out.print(v + " " + k + (++count % 10 == 0 ? "\n" : " "));});
		in.close();			
		
		
		int[][] m = {{1, 2}, {3, 4}, {4, 5}, {1, 3}}; //2D array
		
		//reduce to 1D
		int[] list = Stream.of(m).map(e -> IntStream.of(e)).reduce((e1, e2) -> IntStream.concat(e1, e2)).get().toArray();
		
		//obtain info of the numbers from the 1D array
		IntSummaryStatistics stats = IntStream.of(list).summaryStatistics();
		System.out.println("max: " + stats.getMax());
		System.out.println("min: " + stats.getMin());
		System.out.println("average: " + stats.getAverage());
		System.out.println("sum: " + stats.getSum());
		
		//get the sum of each row
		Stream.of(m).mapToInt(e -> IntStream.of(e).sum()).forEach(e -> System.out.println("Sum of row " + i++ + ": " + e));
		
		//count the occurrences of words in a text
		String str = in.nextLine();
		Stream.of(str.split("[\\s+\\p{P}]")).parallel().filter(e -> e.length() > 0).collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new, Collectors.counting())).forEach((k, v) -> System.out.println(k + " " + v));
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
