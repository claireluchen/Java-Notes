package Sort;

import java.security.SecureRandom;
import java.util.Arrays;

/**
 * This program sorts an array of Integers using bubble sort
 * Both ascending and descending methods are included
 * @author Lu Chen
 */
/*
 * The bubble sort is an O(n^2) algorithm because the outer loop runs in linear time, O(n)
 * For each iteration on the outer loop, there's a number of iterations on the inner loop (array.length - 1)
 * In this case, since the inner loop runs through the entire array linearly, Big O is O(n)
 * If we multiply the number of comparisons, it results in O(n^2)
 */
public class BubbleSort {
	/**
	 * This method sorts an array ascendingly
	 * @param array, int[] array
	 * precondition: an integer array is passed to the method
	 * postcondition: the array passed will be sorted in ascending order
	 */
	public static void sortAscending(int[] array) {
		boolean breakLoop = true;
		//execute the inner loop array.length number of times
		for (int i = 0; i < array.length - 1; i++) {
			//loop through the array and compare each successive pairs
			//after the nth full iteration of the inner loop, the last n elements are sorted
			//therefore the last n elements can be omitted for future sortings
			for (int j = 0; j < array.length - i - 1; j++) { 
				//if the element on the right is greater than the one on the left, swap the elements
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					breakLoop = false; //elements have been swapped, the position has been changed
				}
			}
			if(breakLoop) { //no element has been swapped, all elements have been ordered already
				break; //break from the loop early and return control
			}
		}
	}
	
	/**
	 * This method sorts an array descendingly
	 * @param array, int[] array
	 * precondition: an integer array is passed to the method
	 * postcondition: the array passed will be sorted in descending order
	 */
	public static void sortDescending(int[] array) {
		boolean breakLoop = true;
		//execute the inner loop array.length number of times
		for (int i = 0; i < array.length - 1; i++) {
			//loop through the array and compare each successive pairs
			for (int j = 0; j < array.length - i - 1; j++) { 
				//if the element on the right is smaller than the one on the left, swap the elements
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					breakLoop = false; //elements have been swapped, the position has been changed
				}
			}
			if(breakLoop) { //no element has been swapped, all elements have been ordered already
				break; //break from the loop and return control
			}
		}
	}
	
	/**
	 * This method tests the two sorting methods defined in the class by passing randomly generated integer arrays
	 * @param args
	 * precondition: the class needs to be compiled and running, no argument is needed
	 * postcondition: the unsorted and sorted arrays will be displayed to the console
	 */
	public static void main(String[] args) {
		SecureRandom generator = new SecureRandom();
		//generate an array of 10 integers from 10 to 90, inclusive
		int[] array = generator.ints(10, 10, 91).toArray();
		//display array before sorting
		System.out.println("Array1 before sorting ascendingly: " + Arrays.toString(array));
		sortAscending(array); //sort the array
		//display array after sorting ascendingly
		System.out.println("Array1 after sorting ascendingly: " + Arrays.toString(array));
		
		//generate a second array of 10 integers from 10 to 90, inclusive
		int[] array2 = generator.ints(10, 10, 91).toArray();
		//display array before sorting
		System.out.println("Array2 before sorting descendingly: " + Arrays.toString(array2));
		sortDescending(array2); //sort the array
		//display array after sorting descendingly
		System.out.println("Array2 after sorting descendingly: " + Arrays.toString(array2));
		
	}

}
