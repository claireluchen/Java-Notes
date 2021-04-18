package Recursion;
/*
 * Binary search
 * case 1: if key is less than middle element, recursively search for the key in lower half
 * case 2: if key is equal to middle element, return the index and ends the search
 * case 3: if key is greater than middle element, recursively search for the key in higher half
 */
public class BinarySearch {

	public static int search(int key, int[] array, int low, int high) {
		if (low > high) { //the array has been executed without a match
			return -low-1;
		}
		
		int mid = (low + high) / 2;
		if (key < array[mid]) {
			return search(key, array, low, mid - 1);
		}else if (key == array[mid]) {
			return mid;
		}else {
			return search(key, array, mid + 1, high);
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2};
		System.out.println(search(2, array, 0, array.length - 1));
		
	}

}
