import java.util.ArrayList;
import java.util.List;
//python, range [1, 8)
//{math.prod([j + 1 for j in range(7) if (i & (2 ** j))]) for i in range(1, 2 ** 7)}
public class Combination {
	
	//get all combinations of numbers passed in (in an array)
	//each combination is stored in an array, all arrays are stored in a list, the list is returned
	public static List<Integer[]> getCombinations ( int[] numbers ) {
	    List<Integer[]> combinationList = new ArrayList<Integer[]>();
	    // Start i at 1, so that we do not include the empty set in the results
	    for ( long i = 1; i < Math.pow(2, numbers.length); i++ ) {
	        List<Integer> numberList = new ArrayList<>();
	        for ( int j = 0; j < numbers.length; j++ ) {
	            if ( (i & (long) Math.pow(2, j)) > 0 ) {
	                // Include j in set
	                numberList.add(numbers[j]);
	            }
	        }
	        combinationList.add(numberList.toArray(new Integer[0]));
	    }
	    return combinationList;
	}
	
	//this method prints out each combination, each combination is stored in numberList
	public static void printCombinations(int[] array) {
		for ( long i = 1; i < Math.pow(2, array.length); i++ ) { 
	    	//store the combination
	        List<Integer> numberList = new ArrayList<>();
	        for ( int j = 0; j < array.length; j++ ) {
	        	//using bitwise & operator
	            if ( (i & (long) Math.pow(2, j)) > 0 ) {
	                // Include j in set
	                numberList.add(array[j]);
	            }
	        }
	        System.out.println(numberList);
		}
	}
	
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		List<Integer[]> result = getCombinations(array);
		for (Integer[] arr: result) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("=============");
		
		printCombinations(array);
		
	}

}
