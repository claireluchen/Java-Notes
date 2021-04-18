package Generics;
/*
To declare a generic method, you place the generic type <E> immediately after the keyword static in the method header.
public static <E> void print (E[] list)
To invoke a generic method, prefix the method name with the actual type in angle brackets.
GenericMethodDemo.<Integer>print(integers); or print(integers)
 */
public class GenericMethodDemo {

	public static void main(String[] args) {
		Integer[] integers = {1, 2, 3, 4, 5}; //array that stores integers
		String[] strings = {"London", "Paris", "New York", "Austin"}; //array that stores strings
		
		print(integers); //1 2 3 4 5
		print(strings); //London Paris New York Austin 
	}
	
	//generic method that prints out the content of the array
	//works for any data type
	public static <E> void print(E[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
