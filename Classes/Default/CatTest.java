package Unit8Class;
/**
 * This program tests the Cat class by creating two objects
 * It modifies their attributes and displays the attribute information
 * @author lu
 *
 */
public class CatTest {

	public static void main(String[] args) {
		//create a cat object
		Cat cat1 = new Cat();
		//set the attributes of the first cat
		cat1.setAge(3);
		cat1.setBreed("Persian cat");
		cat1.setName("Charlie");
		cat1.setSex('m');
		cat1.setWeight(20);
		displayInfo(cat1); //display the attributes of the cat1
		
		//create a second cat object
		Cat cat2 = new Cat();
		//set the attributes of the first cat
		cat2.setAge(5);
		cat2.setBreed("Domestic shorthair");
		cat2.setName("Willow");
		cat2.setSex('f');
		cat2.setWeight(10);
		displayInfo(cat2); //display the attributes of the cat2

		//change the name and age of the first cat
		cat1.setName("Oliver");
		cat1.setAge(2);
		
		//display the attributes of the first cat
		displayInfo(cat1);
		
		//change the age and weight of the second cat
		cat2.setAge(7);
		cat2.setWeight(15);
		
		//display the attributes of the second cat
		displayInfo(cat2);
		
		//invoke the meow() method
		System.out.println(cat2.getName() + " is meowing: " + cat2.meow());
		
	}

	public static void displayInfo(Cat cat) {
		System.out.println("The name of the cat is: " + cat.getName());
		System.out.println("The breed of the cat is: " + cat.getBreed());
		System.out.println("The age of the cat is: " + cat.getAge());
		System.out.println("The weight of the cat, in pounds, is: " + cat.getWeight());
		if (cat.getSex() == 'm') {
			System.out.println("The sex of the cat is: male");
		}else {
			System.out.println("The sex of the cat is: female");
		}
		System.out.println();
	}
}
