package Lesson;

import java.util.ArrayList;
import java.util.Random;

/*
a grocery item has an item code and a shelf life
shelf life is measured in between 1 and 30 days (random number generator)
create 50 GroceryItem objects, item code generated sequentially, shelf life randomly
use ArrayList, sort items greater than 7 days into one, less than 7 days into another one, display
 */
public class ArrayListExercise {

	public static void main(String[] args) {
		//ArrayList to store items less or equal to 7
		ArrayList<GroceryItem> itemless = new ArrayList<>();
		//ArrayList to store items greater than 7 days
		ArrayList<GroceryItem> itemgreat = new ArrayList<>();
		
		//create 50 grocery item objects
		for (int i = 1; i <= 50; i++) {
			GroceryItem item = new GroceryItem(i);
			if (item.getLife() > 7) {
				itemgreat.add(item);
			}else {
				itemless.add(item);
			}
		}
		
		System.out.println("Items greater than 7 days");
		display(itemless);
		System.out.println("\n" + "Items greater than 7 days");
		display(itemgreat);
		
		
	}
	
	public static void display(ArrayList<GroceryItem> list) {
		list.forEach(e -> System.out.println(e.getCode() + ": " + e.getLife()));
	}

}

//GroceryItem class
class GroceryItem{
	private int itemCode;
	Random numGenerator = new Random(); //new number generator 
	private int shelfLife = numGenerator.nextInt(30) + 1; //generates number in between 0 and 30
	
	public GroceryItem(int code) {
		itemCode = code;
	}
	
	public int getCode() {
		return itemCode;
	}
	
	public int getLife() {
		return shelfLife;
	}
	
}
