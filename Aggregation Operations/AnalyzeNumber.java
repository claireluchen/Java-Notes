import java.util.Scanner;
import java.util.stream.DoubleStream;

/*
Using streams enable you to write shorter programs that can be executed faster in parallel by using multiple processors
 */
public class AnalyzeNumber {

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
		System.out.println(DoubleStream.of(numbers).filter(e -> e > average).count());
		double max = DoubleStream.of(numbers).max().getAsDouble();
		System.out.println(max);
		in.close();
	}

}
