import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		//create a fixed thread pool with maximum three threads
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		//submit runnable tasks to the executor
		executor.execute(new PrintChar('a', 100));
		executor.execute(new PrintChar('b', 100));
		executor.execute(new PrintNum(100));
		
		//shut down the executor
		executor.shutdown();
		
	}

}
