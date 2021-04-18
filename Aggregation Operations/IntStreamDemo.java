import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamDemo {

	public static void main(String[] args) {
		int[] values = {3, 4, 1, 5, 20, 23, 2, 10};

		//average of distinct even numbers greater than 3
		System.out.println(IntStream.of(values).distinct().filter(e -> e > 3 && e % 2 == 0).average().getAsDouble());
		
		//sum of the first 4 numbers is
		System.out.println(IntStream.of(values).limit(4).sum());
		
		//summary statistics
		IntSummaryStatistics stats = IntStream.of(values).summaryStatistics();
		System.out.println("Count: " + stats.getCount());
		System.out.println("Max: " + stats.getMax());
		System.out.println("Min: " + stats.getMin());
		System.out.println("Sum: " + stats.getSum());
		System.out.println("Average: " + stats.getAverage());
		
		//name array
		String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alan", "Stacy", "Michelle", "John"};
		
		//total character count for all names is
		System.out.println(Stream.of(names).mapToInt(e -> e.length()).sum());
		
		//number of digits in array values is, e -> e.length() can be simplified to String::length
		System.out.println(Stream.of(values).map(e -> e + "").mapToInt(e -> e.length()).sum());
		
	}

}
