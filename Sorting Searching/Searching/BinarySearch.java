package Searching;

import java.security.SecureRandom;
import java.util.Arrays;

public class BinarySearch {
	//perform a binary search on the data, sorted in ascending order
	public static int binarySearchAscending(int[] data, int key) {
		int low = 0; //low end of the search area
		int high = data.length - 1; //high end of the search area
		int middle = (low + high + 1) / 2; //middle element. if even, take the higher one of the middle
		int location = -1;
		
		do {
			if (key == data[middle]) { //see if the middle element fit
				location = middle;
			}else if (key < data[middle]) { //search from the lower half
				high = middle - 1;
			}else { //search from the higher half
				low = middle + 1;
			}
			middle = (low + high + 1) / 2; //recalculate the middle
		}while((low <= high) && (location == -1));
		
		return location;
	}
	
	//perform binary search, descending array
	public static int binarySearchDescending(int[] data, int key) {
		int high = 0; //greater number index
		int low = data.length - 1; //smaller number index
		int middle = (low + high + 1) / 2;
		int location = -1;
		
		for (; low >= high && location == -1;) {
			if (key == data[middle]) {
				location = middle;
			}else if (key < data[middle]) {
				high = middle + 1;
			}else {
				low = middle - 1;
			}
			middle = (low + high + 1) / 2; //recalculate the middle
		}
		return location;
	}
	
	public static void main(String[] args) {
		SecureRandom generator = new SecureRandom();
		
		int[] array = generator.ints(8, 1, 11).sorted().toArray();
		System.out.println(Arrays.toString(array));
		System.out.println(binarySearchAscending(array, 3));
		
		int[] array2 = {7, 5, 4, 3, 2, 1};
		System.out.println(binarySearchDescending(array2, 1));
		
		int[] array3 = {1, 4, 7, 9};
		System.out.println(test(array3, 7));
	}
	
	public static int test(int[] array, int a) {
		int low = 0;
		int high = array.length - 1;
		int middle = (low + high) / 2;
		while (low <= high) {
			if (array[middle] == a) {
				return middle;
			}else if (array[middle] > a) {
				high = middle;
				middle = (low + high) / 2;
			}else if (array[middle] < a) {
				low = middle;
				middle = (low + high) / 2;
			}
		}
		return -1;
	}

}
