package Unit9Class;

import javax.swing.JOptionPane;

/**
 * This program prompts for user input of month, day, year, using a dialog box
 * It displays the date in a String format (mm/dd/yyyy) on the dialog box
 * 3/1/2005 can be displayed as 3/1/2005 or 03/01/2005 as indicated by the user
 * @author Lu Chen
 *
 */
public class DateExercise {
	 
	/**
	 * This method prompts the user for input
	 * It creates a Date object with month, day, year entered by the user
	 * It displays the date in a String format by calling methods from the Date class
	 * @param args
	 * precondition: month, day, year have to be integers. The string entered has to be "yes" or "no"
	 * postcondition: displays the date in String format	 * 
	 */
	public static void main(String[] args) {
		//prompt the user for input
		int month = Input.getInt("Please enter the month");
		int day = Input.getInt("Please enter the day");
		int year = Input.getInt("Please enter the year");
		
		//create a date object according to user input
		Date date = new Date(month, day, year);
		
		//ask the user if they want leading zero to be displayed
		String zero = Input.getString("Please enter \"yes\" to add have leading zeros added, otherwise enter \"no\"");
		if (zero.equals("yes")) {
			JOptionPane.showMessageDialog(null, "The date is " + date.toStringWithZero());
		}else if (zero.equals("no")) {
			JOptionPane.showMessageDialog(null, "The date is " + date.toStringNoZero());
		}else {
			System.out.println("Sorry operation not performed, the input has to be \"yes\" or \"no\"");
		}	
		
	}

}
