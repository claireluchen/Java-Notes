package Unit11Collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This method prompts the user for input and creates Car objects
 * It stores the Car objects in an ArrayList
 * It outputs all of the cars, as well as sorted into ones created before and after 2010s
 * @author Lu Chen
 *
 */
public class CarMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = 0; //keep track of the number of objects created, make sure at least 5 objects are created
		ArrayList<Car> allCar = new ArrayList<>();
		String endInput = ""; //keep track of whether the user would like to continue creating Car
		System.out.println("At least 5 cars have to be created before quitting");
		do{ //get user input
			i++;
			System.out.print("Please enter the maker of the car: ");
			String maker = in.next();
			System.out.print("Please enter the model: ");
			String model = in.next();
			System.out.print("Please enter the year it was built: ");
			int year = in.nextInt();
			//create a new Car object and add it to the allCar ArrayList
			Car newCar = new Car(maker, model, year);
			allCar.add(newCar);
			System.out.println("Would you like to build more cars? If yes, enter \"continue\". If no, enter \"quit\"");
			endInput = in.next();
			if (endInput.equals("quit") && i <= 5) {
				System.out.println("At least 5 Cars have to be created");
			}
		}while(!(endInput.equals("quit")) || i <= 5);
		in.close();
		
		//create two lists to store new and old cars
		ArrayList<Car> newCar = new ArrayList<>();
		ArrayList<Car> oldCar = new ArrayList<>();
		for (int j = 0; j < allCar.size(); j++) { //iterate through the list
			Car car = allCar.get(j); //get the car
			if (car.getYear() < 2010) { //determine which ArrayList to put the car in 
				newCar.add(car);
			}else {
				oldCar.add(car);
			}
		}
		
		System.out.println("\nAll cars created are: ");
		displayCar(allCar);
		System.out.println("\nCars created before 2010 are: ");
		displayCar(newCar);
		System.out.println("\nCars created in and after 2010 are: ");
		displayCar(oldCar);
		
	}
	
	public static void displayCar(ArrayList<Car> list) {
		for (Car car : list) {
			car.display();
		}
	}

}
