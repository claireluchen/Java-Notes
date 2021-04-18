package Unit10Inheritance;

import java.util.Scanner;

/**
 * This class provides a console-based user interface for MemoryCounter objects
 * Its behaviors include: display the menu, get user input, display the current count value
 * @author Lu Chen
 *
 */
public class MemoryCounterConsoleMenu {
	private MemoryCounter memoryCounter;
	private Scanner in;
	
	//default constructor
	public MemoryCounterConsoleMenu() {
		memoryCounter = null;
	}
	//construct with a MemoryCounter object
	public MemoryCounterConsoleMenu(MemoryCounter memoryCounter) {
		this.memoryCounter = memoryCounter;
	}
	
	/**
	 * This method connects a memory counter if needed
	 * @param c, MemoryCounter
	 * precondition: a MemoryCounter object is passed
	 * postcondition: assigns the reference of this MemoryCounter object to the one in this class
	 */
	public void connectMemoryCounter(MemoryCounter c) {
		memoryCounter = c;
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
		System.out.println("Enter 3 to reset the count");
		System.out.println("Enter 4 to show the count");
		System.out.println("Enter 5 to add the current count to the memory count value");
		System.out.println("Enter 6 to reset the memory count value");
		System.out.println("Enter 7 to display the memory count value");
		System.out.println("Enter 8 to end the program");
	}
	
	/**
	 * This method returns an integer input from the user. A Scanner object is created
	 * @return int, integer entered by the user
	 * postcondition: returns a integer input
	 */
	public int getNumInput() {
		in = new Scanner(System.in); //create a Scanner object for user input
		return in.nextInt();
	}
	
	/**
	 * This method modifies the count of the counter according to the option chosen by the user
	 * @param userOption, int
	 * precondition: an integer value entered by the user is passed
	 * postcondition: the count of the counter object is modified
	 */
	public void modifyMemoryCounter(int userOption) {
		if (userOption >= 1 || userOption <= 7) {
			if (userOption == 1) {
				memoryCounter.incrementCount();
			}else if (userOption == 2) {
				memoryCounter.decrementCount();
			}else if (userOption == 3) {
				memoryCounter.resetCount();
			}else if (userOption == 4) {
				displayCount();
			}else if (userOption == 5){
				memoryCounter.addMemory();
			}else if (userOption == 6){
				memoryCounter.resetMemory();
			}else if (userOption == 7){
				displayMemoryValue();
			}else{
				System.out.println("Program ended");
				System.exit(0);
			}			
		}else {
			System.out.println("The input is invalid, has to be between 1 and 5, inclusive");
		}
	}
	
	/**
	 * This method displays the count of the MemoryCounter object
	 * precondition: a memoryCounter is created
	 * postcondition: the count is displayed
	 */
	public void displayCount() {
		System.out.println("The current count is: " + memoryCounter.getCount());
	}
	
	/**
	 * This method invokes the displayMemoryValue() of MemoryCounter to display the memory value
	 * precondition:a memoryCounter is created
	 * postcondition: the memory count value is displayed 
	 */
	public void displayMemoryValue() {
		memoryCounter.displayMemoryValue();
	}
		
}
