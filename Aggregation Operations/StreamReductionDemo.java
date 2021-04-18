import java.util.stream.IntStream;
import java.util.stream.Stream;
/*
A reduction takes the elements from a stream to produce a single value by repeated application of a binary operation such as addition, multiplication, or finding the maximum between two elements.
The reduce method takes two arguments. 
The first is an identity (starting value). 
The second argument is an object of the functional interface IntBinaryOperator.
This interface contains the abstract method applyAsInt(int e1, int e2) that returns an int value from applying a binary operation.
 */
public class StreamReductionDemo {

	public static void main(String[] args) {
		int[] values = {3, 4, 1, 5, 6, 2};
		
		//the values are
		IntStream.of(values).forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		//using reduction, the result of multiplying all values is
		System.out.println(IntStream.of(values).reduce(1, (e1, e2) -> e1 * e2));
		
		//display the value
		//the reduce method can be called without an identity
		//reduce method reduces the strings in the stream into one composite string that consists of all strings in the stream separated by commas
		System.out.println(IntStream.of(values).mapToObj(e -> e + "").reduce((e1, e2) -> e1 + ", " + e2).get());
		
		String[] names = {"Aaa", "bbb", "ccc", "ddd"};
		//display name with ", "
		System.out.println(Stream.of(names).reduce((x, y) -> x + ", " + y).get());
		
		//concat the names
		System.out.println(Stream.of(names).reduce((x, y) -> x + y).get()); //can be reduced to reduce(String::concat)
		
		//total number of characters
		System.out.println(Stream.of(names).reduce((x, y) -> x + y).get().length());
				
	}

}
