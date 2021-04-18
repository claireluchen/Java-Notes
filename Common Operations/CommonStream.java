import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CommonStream {

	public static void main(String[] args) {
		String[] stringArray = {"A", "F", "B", "E", "C", "D"};
		
		//display the first 4 elements sorted, the array itself isn't changed
		Stream.of(stringArray).limit(4).sorted().forEach(e -> System.out.print(e + " "));
		
		//assign the sorted array to the variable
		stringArray = Stream.of(stringArray).limit(5).sorted().toArray(String[]::new); //A B C E F
		
		//skip first 2 elements, then new array
		stringArray = Stream.of(stringArray).skip(2).toArray(String[]::new); //C E F

		//keep all elements that come before "F"
		stringArray = Stream.of(stringArray).filter(e -> ((int) e.charAt(0)) < ((int) 'F')).toArray(String[]::new); //C E
		
		//check if any of the elements of the array is "C"
		boolean containsC = Stream.of(stringArray).anyMatch(e -> e.equals("C"));
		
		String[] arrayString = {"one", "Juliet", "Romeo", "act", "juliet"};
		//filter out strings that are shorter than length 4, get string with the longest length
		String largestString = Stream.of(arrayString).filter(e -> e.length() > 4).max(Comparator.comparingInt(String::length)).get();
		
		//get string with shortest length
		String shortestString = Stream.of(arrayString).min(Comparator.comparingInt(String::length)).get();
		
		//get the smallest String alphabetically, note Capital letters come before lower case ones
		String smallestStringIncludeCaptical = Stream.of(arrayString).min(String::compareTo).get();
		
		//get the smallest String alphabetically, ignoring case
		String smallestStringIgoreCaptical = Stream.of(arrayString).map(String::toLowerCase).min(String::compareTo).get(); //act
		
		//get the total character count for all elements of the array
		int totalCharCount = Stream.of(arrayString).mapToInt(e -> e.length()).sum();

		
		int[] values = {3, 2, 6, 1, 5, 2, 8};
		//get the average of distinct even numbers that are larger than 3
		double average = IntStream.of(values).distinct().filter(e -> e > 3 && e % 2 == 0).average().getAsDouble();
		
		//get sum of first 5 values
		double sum = IntStream.of(values).limit(5).sum();
		
		//get statistics
		IntSummaryStatistics stats = IntStream.of(values).summaryStatistics();
		long countIntArray = stats.getCount();
		int maxIntArray = stats.getMax();
		int minIntArray = stats.getMin();
		double averageIntArray = stats.getAverage();
		long sumIntArray = stats.getSum();
		
		
		//get distinct list
		Integer[] tempArray = {2, 7, 3, 6, 2, 7};
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, tempArray);
		list = (ArrayList<Integer>) list.stream().distinct().collect(Collectors.toList());
		
//		for (String i : stringArray) {System.out.print("\n" + i);}
	}

}
