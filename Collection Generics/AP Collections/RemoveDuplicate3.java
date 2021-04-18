package Unit11Collections;

import java.util.ArrayList;

public class RemoveDuplicate3 {

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
		removeDuplicates(list);
		
		System.out.println("Modified list with no duplicate: ");
		//display the modified list
		display(list);
	}

	/**
	 * This method modifies the ArrayList passed as an argument, with duplicated elements removed
	 * It checks if any element before the current element is the same as the current element
	 * It removes the current element if the value of the current element already exists
	 * @param list, an ArrayList<Integer>
	 */
	public static void removeDuplicates(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) { //loop through the elements
			for (int j = 0; j < i; j++) { //loop through the elements before the current element
				if (list.get(j) == list.get(i)) { //check to see if it's the same as a previous one
					list.remove(i); //removes the current element
					//since the element is removed, the next element to evaluate should be at the current index
					//the index should not be increased
					i--; 
					break;
				}
			}
		}		
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
