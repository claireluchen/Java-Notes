import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		//create an array
		Random random = new Random();
		int[] list = random.ints(200_000_000).toArray(); //200_000_000 can be used to improve readibility
		
		//number of available processors
		System.out.println(Runtime.getRuntime().availableProcessors()); //4
		
		//test how long it takes to run a sequential stream
		long startTime = System.currentTimeMillis();
		int[] list1 = IntStream.of(list).filter(e -> e > 0).sorted().limit(5).toArray(); 
		System.out.println(Arrays.toString(list1));
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		//test how long it takes to run a parallel stream
		startTime = System.currentTimeMillis();
		int[] list2 = IntStream.of(list).parallel().filter(e -> e > 0).sorted().limit(5).toArray();
		System.out.println(Arrays.toString(list2));
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
	}

}
