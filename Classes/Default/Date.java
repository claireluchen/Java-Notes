package Unit9Class;
//precondition, postcondition
/**
 * This class has integer day, month, year attributes
 * It provides setter and getter methods, as well as a toString method to display the date in mm/dd/yyyy
 * @author Lu Chen
 *
 */
public class Date {
	private int day;
	private int month;
	private int year;
	
	//default constructor
	public Date() {
		day = 1;
		month = 1;
		year = 1;
	}
	
	//constructor with arguments
	public Date(int month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	/**
	 * This method sets the day, makes sure that it's valid for the current month and year
	 * @param day
	 * precondition: the day has to be an integer
	 * postcondition: updates the day when the input is within the valid range
	 */
	public void setDay(int day) {
		if (day <= getNumDaysInMonth(month, year)) {
			this.day = day;
		}else {
			System.out.println("Update not completed. The day is invalid for the given month and year");
		}
	}
	
	/**
	 * This method returns the day of the Date object
	 * @return int, the day
	 * postcondition: returns the day of the Date object
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * This method sets the month, makes sure that it's valid
	 * @param month
	 * precondition: the month has to be an integer
	 * postcondition: updates the month when the input is within the valid range
	 */
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Invalid month, has to be between 1 and 12, inclusive");
		}else {
			this.month = month;
		}		
	}
	
	/**
	 * This method returns the month of the Date object
	 * @return int, the month
	 * postcondition: returns the month of the Date object
	 */
	public int getMonth() {
		return month;
	}
	
	/**
	 * This method sets the year, makes sure that it's valid
	 * @param year
	 * precondition: the year has to be an integer
	 * postcondition: updates the year according to the input
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * This method returns the year of the Date object
	 * @return int, the year
	 * postcondition: returns the year of the Date object
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * This method sets month, day, year of the Date object.
	 * It calls the setMonth(), setDay(), setYear() methods to validate the input
	 * @param month, int
	 * @param day, int
	 * @param year, int
	 * precondition: month, day, year have to be integers
	 * postconditions: updates the month, day, year of the Date object if the input is valid
	 */
	public void setFullDate(int month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}
	
	/**
	 * This method returns the day in mm/dd/yyyy format, with no zero added.
	 * 3/12/2005 would be return as 3/12/2005
	 * @return String
	 * postcondition: returns a String in mm/dd/yyyy format, with no additional zeros added
	 */
	public String toStringNoZero() {
		return getMonth() + "/" + getDay() + "/" + getYear();
	}
	
	/**
	 * This method returns the day in mm/dd/yyyy format, with zero(s) added.
	 * 3/1/2005 would be return as 03/01/2005
	 * @return String
	 * postcondition: returns a String in mm/dd/yyyy format, additional leading zeros are added
	 */
	public String toStringWithZero() {
		return String.format("%02d/%02d/%04d", getMonth(), getDay(), getYear());
	}
	
	/**
	Returns the number of days in a specified month and year. Leap years are accounted
	@param m is the month
	@param y is the year
	@return int, the number of days in the month
	precondition: valid month
	postcondition: returns the number of days in the specified month
	 */
	private int getNumDaysInMonth(int m, int y) {
		if (m == 2) { //return number of days in February 
			if (year % 4 == 0) {
				return 29;
			}else {
				return 28;
			}
		}else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
			return 31; //return 31-day month
		}else {
			return 30; //return 30-day month
		}
	}
	
}
