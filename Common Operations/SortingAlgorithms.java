

public class SortingAlgorithms {

	public static void main(String[] args) {
		int[] array = {4, 8, 2, 9, 1, -1, 7};
		insertionSort(array);
		for (int i : array) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		int[] array2 = {4, 8, 2, 9, 1, -1, 7};
		selectionSort(array2);
		for (int i : array2) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		int[] array3 = {4, 8, 2, 9, 1, -1, 7};
		bubbleSort(array3);
		for (int i : array3) {
			System.out.printf("%d ", i);
		}
	}

	public static int[] insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j;
			for (j = i - 1; j >= 0 && array[j] > current; j--) {
				array[j + 1] = array[j];
			}
			//j + 1 because of the j-- from the last iteration that doesn't satisfy the condition
			array[j + 1] = current; 
		}
		return array;
	}
	
	public static int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int newMinIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) {
					min = array[j];
					newMinIndex = j;
				}
			}
			array[newMinIndex] = array[i];
			array[i] = min;			
		}
		return array;
	}
	
	public static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}	
}
