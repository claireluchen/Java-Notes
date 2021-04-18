package Sort;

import java.util.Arrays;
import java.util.Random;

/*
 * Sorts an array by splitting it into two equal-sized subarrays, sorting each subarray, then merging them into one larger array
 */
public class MergeSort {
	//calls recursive sortArray method to begin merge sorting
	public static void mergeSort(int[] data) {
		sortArray(data, 0, data.length - 1); //sort entire array
	}
	
	//split array, sorts subarrays and call method to merge subarrays into sorted array
	private static void sortArray(int[] data, int low, int high) {
		//test base case; size of array equals 1. if the size is 1, the array is already sorted, return immediately
		if ((high - low) >= 1) { //if not base case
			int middle1 = (low+ high) / 2; //calculate middle of array
			int middle2 = middle1 + 1; //calculate next element over
			
			//split array in half; sort each half
			sortArray(data, low, middle1); //first half of array
			sortArray(data, middle2, high); //second half of array
			
			//merge two sorted arrays after split calls return
			merge(data, low, middle1, middle2, high);	
		}
	}
	
	//merge two sorted subarrays into one sorted subarray
	private static void merge(int[] data, int left, int middle1, int middle2, int right) {
		int leftIndex = left;
		int rightIndex = middle2;
		int combinedIndex = left;
		int[] combined = new int[data.length];
		
		//merge arrays until reaching end of either
		while(leftIndex <= middle1 && rightIndex <= right) {
			if (data[leftIndex] <= data[rightIndex]) {
				combined[combinedIndex++] = data[leftIndex++];
			}else {
				combined[combinedIndex++] = data[rightIndex++];
			}
		}
		
		//if left array is empty
		if (leftIndex == middle2) {
			//copy in rest of the right array
			while (rightIndex <= right) {
				combined[combinedIndex++] = data[rightIndex++];
			}
		}else { //right array is empty
			//copy in rest of the left array
			while (leftIndex <= middle1) {
				combined[combinedIndex++] = data[leftIndex++];
			}
		}
		
		//copy values back into original array
		for (int i = left; i <= right; i++) {
			data[i] = combined[i];
		}		
	}			
	
	public static void main(String[] args) {
		Random generator = new Random();
		int[] data = generator.ints(10, 10, 91).toArray();
		System.out.println("Unsorted array: " + Arrays.toString(data));
		mergeSort(data);
		System.out.println("Sorted array: " + Arrays.toString(data));
	}

}
