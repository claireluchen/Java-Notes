package Unit10Inheritance;
/**
 * This Date class stores month, day, year and a dateString method that returns the Date
 * @author Lu Chen
 *
 */
public class Date {
	//data field
	private int month;
	private int day;
	private int year;
	
	//constructors
	public Date() {}
	public Date(Date date) {
		month = date.getMonth();
		day = date.getDay();
		year = date.getYear();
	}
	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
	
	//setters
	public void setMonth(int m) {month = m;}
	public void setDay(int d) {day = d;}
	public void setYear(int y) {year =  y;}
	
	//getters
	public int getMonth() {return month;}
	public int getDay() {return day;}
	public int getYear() {return year;}
	
	public String dateString() {
		return getMonth() + "/" + getDay() + "/" + getYear();
	}
}
