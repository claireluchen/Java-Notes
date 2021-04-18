import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelMax {

	public static void main(String[] args) {
		//create a list
		int[] list = new int[9000000];
		for (int i = 0; i < list.length; i++) {
			list[i] = i;
		}
		
		long startTime = System.currentTimeMillis();
		System.out.println("Max number is: " + max(list));
		long endTime = System.currentTimeMillis();
		System.out.println("Parallel time with " + Runtime.getRuntime().availableProcessors() + " processors is " + (endTime - startTime));
				
	}

	public static int max(int[] list) {
		RecursiveTask<Integer> task = new MaxTask(list, 0, list.length);
		ForkJoinPool pool = new ForkJoinPool();
		return pool.invoke(task);
	}
	
	//define concrete ForkJoinTask
	private static class MaxTask extends RecursiveTask<Integer>{
		private final static int THRESHOLD = 1000;
		private int[] list;
		private int low;
		private int high;
		
		public MaxTask(int[] list, int low, int high) {
			this.list = list;
			this.low = low;
			this.high = high;
		}
		
		@Override
		public Integer compute() {
			if (high - low < THRESHOLD) {
				int max = list[0];
				for (int i = low; i < high; i++) {
					if (list[i] > max) {
						max = list[i];
					}
				}
				return max;
			}else {
				int mid = (low + high) / 2;
				RecursiveTask<Integer> left = new MaxTask(list, low, mid);
				RecursiveTask<Integer> right = new MaxTask(list, mid, high);
				//causing the tasks to be executed
				right.fork();
				left.fork();
				//awaits for the task to complete and returns the result
				return Math.max(left.join().intValue(), right.join().intValue());
			}
		}
	}
	
}
