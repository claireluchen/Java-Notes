package Unit9Class;

import java.util.Scanner;

/**
 * This class is the aggregating class of counter
 * It displays options onto the console, receives information from the user and outputs the result
 * @author Lu Chen
 *
 */
public class CounterConsoleMenu {
	private Counter aCounter; //a counter object
	private Scanner in;
	
	//default constructor
	public CounterConsoleMenu() {
		aCounter = null;
	}
	
	//construct with a counter object
	public CounterConsoleMenu(Counter counter) {
		aCounter = counter;
	}
	
	/**
	 * This method connects a counter if needed
	 * @param c, Counter
	 * precondition: a Counter object is passed
	 * postcondition: assigns the reference of this Counter object to the one in this class
	 */
	public void connectCounter(Counter c) {
		aCounter = c;
	}
	
	/**
	 * This method displays the options to the user
	 * precondition: a counter object is created
	 * postcondition: the options to modify the counter is displayed on the console
	 */
	public void displayMenu() {
		System.out.println("Please choose from the following options: ");
		System.out.println("Enter 1 to increment the counter");
		System.out.println("Enter 2 to decrement the counter");
		System.out.println("Enter 3 to reset the counter");
		System.out.println("Enter 4 to show the counter");
		System.out.println("Enter 5 to end the program");
	}
	
	/**
	 * This method returns an integer input from the user. A Scanner object is created and closed
	 * @return int, integer entered by the user
	 * postcondition: returns a integer input
	 */
	public int getNumInput() {
		in = new Scanner(System.in); //create a Scanner object for user input
		return in.nextInt();
	}
	
	
	/**
	 * This method displays the count of the Counter object
	 * precondition: a counter is created
	 * postcondition: the count is displayed
	 */
	public void displayCount() {
		System.out.println("The current count is: " + aCounter.getCount());
	}
	
	/**
	 * This method modifies the count of the counter according to the option chosen by the user
	 * @param userOption, int
	 * precondition: an integer value entered by the user is passed
	 * postcondition: the count of the counter object is modified
	 */
	public void modifyCounter(int userOption) {
		if (userOption >= 1 || userOption <= 5) {
			if (userOption == 1) {
				aCounter.increment();
			}else if (userOption == 2) {
				aCounter.decrement();
			}else if (userOption == 3) {
				aCounter.reset();
			}else if (userOption == 4) {
				displayCount();
			}else {
				System.out.println("Program ended");
				System.exit(0);
			}			
		}else {
			System.out.println("The input is invalid, has to be between 1 and 5, inclusive");
		}
	}
	
}
