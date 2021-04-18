package Sort;

import java.util.Arrays;
import java.util.Random;

/*
 * The first iteration takes the second element in the array and, if it¡¯s less than the first element, swaps it with the first element.
 * The second iteration looks at the third element and inserts it into the correct position with respect to the first two
 * At the ith iteration of the algorithm, the first i elements will be sorted
 */
public class InsertionSort {
	//sort array using insertion sort
	public static void insertionSort(int[] data) {
		//loop over data.length - 1 elements
		for (int next = 1; next < data.length; next++) {
			int insert = data[next]; //value to insert
			int moveItem = next; //location to place element
			
			//search for place to put current element
			while (moveItem > 0 && data[moveItem - 1] > insert) {
				//shift element right one slot
				data[moveItem] = data[moveItem - 1];
				moveItem--;
			}
			
			data[moveItem] = insert; //place inserted element
		}
		
	}
	
	public static void main(String[] args) {
		Random generator = new Random();
		int[] array = generator.ints(10, 10, 91).toArray();
		System.out.println(Arrays.toString(array));
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

}
