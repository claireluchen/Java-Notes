package Sort;

import java.util.Arrays;
import java.util.Random;

/*
 * If sorting in increasing order, the first iteration selects the smallest element in the array and swaps it with the first element. 
 * The second iteration selects the second smallest item (which is the smallest item of the remaining elements) and swaps it with the second element
 * After ith iteration, the smallest i items of the array will be sorted into increasing order in the first i elements of the array. 
 * A total of i-1 iterations is needed since the largest/last one doesn¡¯t need to be checked.
 */
public class SelectionSort {
	//swap the two elements of the array
	public static void swap(int[] data, int first, int second) {
		int temp = data[first];
		data[first] = data[second];
		data[second] = temp;
	}
	
	//sort array using selection sort
	public static void selectionSort(int[] data) {
		for (int i = 0; i < data.length - 1; i++) {
			int smallest = i; //first index of remaining array
			for (int j = i+1; j < data.length; j++) {
				if (data[j] < data[smallest]) {
					smallest = j;
				}
			}
			swap (data, i, smallest);
		}
	}
	
	public static void main(String[] args) {
		Random generator = new Random();
		int[] array = generator.ints(10, 10, 91).toArray();
		System.out.println(Arrays.toString(array));
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}

}
