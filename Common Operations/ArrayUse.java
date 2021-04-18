import java.util.Scanner;

public class ArrayUse {

	public static void main(String[] args) {
		//prefix sum array
		//while traversing the array, update the element by adding it with its previous element
		//sum of array[a] to array[b], inclusive, is psarray[b] - psarray[a-1]
		int[] array = {2, 6, 3, 1, 8, 3};
		int[] prefixSumArray = new int[array.length];
		prefixSumArray[0] = array[0]; //first element are the same
		for (int i = 1; i < prefixSumArray.length; i++) {
			prefixSumArray[i] = prefixSumArray[i - 1] + array[i];
		}
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("Sum of array from element a to b, inclusive, is " + (prefixSumArray[b] - prefixSumArray[a-1]));
		in.close();
	}

}
