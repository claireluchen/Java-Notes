package Searching;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	//returns the index of the key if found in the array, otherwise returns -1
	public static int linearSearch(int[] data, int searchKey) {
		for (int i = 0; i < data.length; i++) {
			if (data[i] == searchKey) {
				return i;
			}
		}
		return -1; //not found
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		SecureRandom generator = new SecureRandom();
		//generate an array of 10 elements, the random value produced will be in the range 10 up to, but not including, 91
		int[] data = generator.ints(10, 10, 91).toArray();
		//display array
		System.out.println(Arrays.toString(data)); 
		
		System.out.println("Please enter an integer value (-1 to quit)");
		int key = in.nextInt(); in.close();
		int index = linearSearch(data, key); //use method
		System.out.println(index);
	}

}
