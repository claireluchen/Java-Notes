import java.util.stream.IntStream;

public class ParallelSequential {

	public static void main(String[] args) {
		int sum = 0;
		int[] number = {1, 4, 2, 6, 3};
		
		//sequential stream
		long start = System.currentTimeMillis(); //record the start time
		sum = IntStream.of(number).reduce(0, (e1, e2) -> e1 + e2);
		long end = System.currentTimeMillis(); //record the end time
		System.out.println(end - start); //print out how long it took
		System.out.println(sum);

		//parallel stream
		start = System.currentTimeMillis();
		sum = IntStream.of(number).parallel().reduce(0, (e1, e2) -> e1 + e2);
		end = System.currentTimeMillis(); 
		System.out.println(end - start); 
		System.out.println(sum);
		
	}

}
