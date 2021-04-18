package Generics;
//a generic method for sorting an array of Comparable objects
public class GenericSort {

	public static void main(String[] args) {
		//create an Integer array
		Integer[] intArray = {2, 4, 3};
		//create a Double array
		Double[] doubleArray = {3.4, 1.3, -22.1};
		//create a Character array
		Character[] charArray = {'a', 'b', 'c'};
		//create a String array
		String[] stringArray = {"Tom", "Susan", "Kim"};
		
		//sort the arrays
		sort(intArray);
		sort(doubleArray);
		sort(charArray);
		sort(stringArray);
		
		printList(intArray); //2 3 4 
		printList(doubleArray); //-22.1 1.3 3.4
		printList(charArray); //a b c
		printList(stringArray); //Kim Susan Tom
	}

	//sort an array of comparable objects
	//specifies that E is a subtype of Comparable, and specifies tat the elements to be compared are of E type
	public static <E extends Comparable<E>> void sort (E[] list) {
		E currentMin;
		int currentMinIndex;
		
		for (int i = 0; i < list.length; i++) {
			currentMin = list[i];
			currentMinIndex = i;
			
			//find the minimum in the list [i+1...list.length-2]
			for (int j = i+1; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			//swap list[i] with list[currentMinIndex] if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
			
		}
	}	
	
	//print an array of objects
	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
	
}
