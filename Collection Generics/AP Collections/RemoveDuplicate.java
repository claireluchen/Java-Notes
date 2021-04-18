package Unit11Collections;

import java.util.ArrayList;

/**
 * This program contains a method that removes duplicate values from an ArrayList of integers
 * The main() method is used to test the removeDuplicates(ArrayList<Integer> list) method
 * @author Lu Chen
 *
 */
public class RemoveDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) { //fill the list with 20 numbers
			//generate 20 random numbers from 1 to 10
			int num = (int)(Math.random() * 10) + 1;
			list.add(num);
		}
		
		System.out.println("Original list: ");
		//display the list
		display(list);
		
		//pass the list to the method
		ArrayList<Integer> newList = removeDuplicates(list);
		
		System.out.println("Modified list with no duplicate: ");
		//display the modified list
		display(newList);
	}

	/**
	 * This method returns an ArrayList of Integers, with duplicated elements removed
	 * It adds each unique element from originalList to newList
	 * It checks whether an element already exists using contains()
	 * @param originalList, an ArrayList<Integer>
	 * @return ArrayList<Integer>
	 */
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> originalList) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int i = 0; i < originalList.size(); i++) {
			if (!newList.contains(originalList.get(i))) { //if the newList doesn't contain that element
				newList.add(originalList.get(i));
			}
		}
		return newList;
	}
	
	//this method displays an ArrayList of integers to the console
	public static void display(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (i != list.size() - 1) {
				System.out.print(list.get(i) + ", ");
			}else {
				System.out.println(list.get(i));
			}
		}
	}
	
}
