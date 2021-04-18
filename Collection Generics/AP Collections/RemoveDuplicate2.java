package Unit11Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 20; i++) { //fill the list with 20 numbers
			//generate 20 random numbers from 1 to 10
			int num = (int)(Math.random() * 10) + 1;
			list.add(num);
		}
		
		//display the list
		System.out.println(list);
				
		//pass the list to the method
		HashSet<Integer> set = new HashSet<>();
		for (Integer num : list) {
			set.add(num);
		}	
		
		//display the modified list
		System.out.println(set);
		
	}
	
}
