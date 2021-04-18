package Unit11Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class PetTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//an ArrayList that stores Pet objects
		ArrayList<Pet> petList = new ArrayList<>();
		
		for (;;) {
			System.out.print("Please enter \"dog\" to create a dog, \"cat\" to create a cat, \"quit\" to quit: ");
			String userInput = in.next();
			if(userInput.equals("dog")) {
				System.out.print("Please enter its name: ");
				String name = in.next();
				System.out.print("Please enter its weight: ");
				double weight = in.nextDouble();
				System.out.print("Please enter its age: ");
				int age = in.nextInt();
				//create a dog object
				Pet dog = new Dog(name, weight, age);
				//add the dog object to the list
				petList.add(dog);
			}else if (userInput.equals("cat")) {
				System.out.print("Please enter its name: ");
				String name = in.next();
				System.out.print("Please enter its weight: ");
				double weight = in.nextDouble();
				System.out.print("Please enter its age: ");
				int age = in.nextInt();
				//create a cat object
				Pet cat = new Cat(name, weight, age);
				//add the cat object to the list
				petList.add(cat);
			}else if (userInput.equals("quit")){
				break;
			}else {
				System.out.println("Invalid input, has to be \"dog\", \"cat\", or \"quit\"");
			}			
		}
		in.close();
		
		System.out.println("\nHere are the pets you've created: ");		
		for (Pet pet : petList) { //iterate through the list and display the attributes
			pet.displayAttributeInfo();
		}
		System.out.printf("%nThe average age of all pets in the list is: %.2f", calculateAverage(petList));
		
	}

	/**
	 * This method receives an ArrayList of Pet objects
	 * It calculates and returns the average age of all pets
	 * @param list
	 * @return
	 */
	public static double calculateAverage(ArrayList<Pet> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getAge();
		}
		double average = ((double) sum) / list.size();
		return average;
	}
	
}
