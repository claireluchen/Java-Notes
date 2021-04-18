import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TwoDimensionalArrayStream {
	private static int i = 0;
	
	public static void main(String[] args) {
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
		
	}

}
