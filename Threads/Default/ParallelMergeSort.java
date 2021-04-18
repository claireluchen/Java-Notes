import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.stream.IntStream;

//develops parallel programs using the Fork/Join Framework
//The merge sort algorithm divides the array into two halves and applies a merge sort on each half recursively
//after the two halves are sorted, the algorithm merges them
public class ParallelMergeSort {

	public static void main(String[] args) {
		final int SIZE = 7000000;
		int[] list1 = new int[SIZE];
		int[] list2 = new int[SIZE];
		
		for (int i = 0; i < list1.length; i++) {
			list1[i] = list2[i] = (int)(Math.random() * 10000);
		}
		
		//parallel
		long startTime = System.currentTimeMillis();
		parallelMergeSort(list1);
		long endTime = System.currentTimeMillis();
		System.out.println("Parallel time with " + Runtime.getRuntime().availableProcessors() + " processors is " + (endTime - startTime));
		
		//sequential
		startTime = System.currentTimeMillis();
		IntStream.of(list2).sorted().toArray();
		endTime = System.currentTimeMillis();
		System.out.println("Sequential time: " + (endTime - startTime));
		
		
	}

	//parallel merge sort
	public static void parallelMergeSort(int[] list) {
		//create a FortJoinTask
		RecursiveAction mainTask = new SortTask(list);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(mainTask);
	}
	
	//define concrete ForkJoinTask
	private static class SortTask extends RecursiveAction{
		private final int THRESHOLD = 500;
		private int[] list;
		SortTask(int[] list){
			this.list = list;
		}
		
		@Override
		protected void compute() { //performs the task
			if (list.length < THRESHOLD) {
				Arrays.sort(list);
			}else { //split into two parts
				//obtain the first half
				int[] firstHalf = new int[list.length / 2];
				System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
				//obtain the second half
				int[] secondHalf = new int[list.length / 2];
				System.arraycopy(list, 0, secondHalf, 0, list.length / 2);
				
				//recursively sort the two halves
				invokeAll(new SortTask(firstHalf), new SortTask(secondHalf));
				
				//merge firstHalf with secondHalf into list
				MergeSort.merge(firstHalf, secondHalf, list);
			}
		}
	}
	
	//1 processor sort
	private static class MergeSort{
		
		public static void merge(int[] firstHalf, int[] secondHalf, int[] list) {
			System.arraycopy(firstHalf, 0, list, 0, firstHalf.length);
			System.arraycopy(secondHalf, 0, list, firstHalf.length-1, secondHalf.length);
		}
		
	}
	
}
