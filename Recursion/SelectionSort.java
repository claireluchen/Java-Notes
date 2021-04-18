package Recursion;
/*
 * Find the smallest element in the list and swaps it with the first element
 * Then find the smallest element in the remaining list and swap it with the first element of the remaining list
 * 1. Find the smallest element in the list and swap it with the first element
 * 2. Ignore the first element and sort the remaining smaller list recursively
 */
public class SelectionSort {

	public static void sort(int[] list, int start) {
		int min = Integer.MAX_VALUE;
		int minIndex = start;
		for (int i = start; i < list.length; i++) {
			if (min > list[i]) {
				minIndex = i;
				min = list[i];
			}
		}
		
		//swap the start and the minIndex (min)
		list[minIndex] = list[start]; //assign the original number at the starting index position to the position of the minimum
		list[start] = min; //assign the new minimum to the starting index position
		
		if (start == list.length - 2) {
			return;
		}else {
			sort(list, ++start);
		}
	}
	
	public static void main(String[] args) {
		int[] list = {3, 4, 2, 6, 1, 5, 2};
		sort(list, 0);
		for (int i : list) {
			System.out.print(i + " ");
		}
		
	}

}
