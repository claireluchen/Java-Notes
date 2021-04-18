package Assignment2Vehicle;

import java.util.Scanner;

/*
- create an array of type Vehicle, populates it with a few Boat and Car objects. 
- prompt the user to enter attributes for the objects
- use a looping construct to iterate through the array 
display object attributes and invoke the display() method.
 */
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of objects to create ");
		//an array of type Vehicle
		Vehicle[] vehicle = new Vehicle[in.nextInt()];
		System.out.println();
		
		//assign Boat or Car object to each array element, using random numbers
		for (int i = 0; i < vehicle.length; i++) {
			double num = Math.random();
			if (num < 0.5) {
				vehicle[i] = new Boat();
			}else {
				vehicle[i] = new Car();
			}
		}
		
		//loop through the array, asking the user to input attributes
		for (int i = 0; i < vehicle.length; i++) {
			if (vehicle[i] instanceof Boat) {
				//boat object, ask for length and draft
				//create a boat object that represents vehicle[i]
				Boat boat = (Boat) vehicle[i];
				System.out.print("Enter the length of the boat, in meters ");
				//set the length of the boat
				boat.setLength(in.nextDouble());
				System.out.print("\n" + "Enter the draft of the boat, in meters ");
				//set the draft
				boat.setDraft(in.nextDouble());
				System.out.println();
			}else {
				//car object, ask for make and year
				//create a car object that represents vehicle[i]
				Car car = (Car) vehicle[i];
				System.out.print("Enter the brand of the car " );
				//set the brand of the car
				car.setMake(in.next());
				System.out.print("\n" + "Enter the year the car was made ");
				//set the year it was made
				car.setYear(in.nextInt());
				System.out.println();
			}
		}
		
		//loop through the array, displaying each attribute and invoke the display() method
		for (int i = 0; i < vehicle.length; i++) {
			if (vehicle[i] instanceof Boat) {
				//create a boat object that represents vehicle[i]
				Boat boat = (Boat) vehicle[i];
				System.out.println("The length of the boat is " + boat.getLength() + "m");
				System.out.println("The draft of the boat is " + boat.getDraft() + "m");
				//polymorphic behavior
				//vehicle[i].display();
			}else {
				//create a car object that represents vehicle[i]
				Car car = (Car) vehicle[i];
				System.out.println("The brand of the car is " + car.getMake());
				System.out.println("The car was made in " + car.getYear());
				//polymorphic behavior
				//vehicle[i].display();
			}
			//display() method defined in the Vehicle abstract class
			//calls concrete method polymorphically depending on the actual type
			vehicle[i].display();
		}		
		

	}

}
