package Assignment2Vehicle;
/*
Extends the Vehicle abstract class
- provide definition for the display() method
- data attribute: make, year
- method: display() "car object" + length + draft
- getter, setter, 2 constructors
 */
public class Car extends Vehicle{
	//data field
	private String make;
	private int year;
	
	//default constructor
	public Car() {
		
	}
	
	//constructor with 2 parameters
	public Car(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	//get make
	public String getMake() {
		return make;
	}
	
	//set make
	public void setMake(String make) {
		this.make = make;
	}
	
	//get the year
	public int getYear() {
		return year;
	}
	
	//set year
	public void setYear(int year) {
		this.year = year;
	}
	
	//display() method
	@Override
	public void display() {
		System.out.println("This is a Car object, the brand is " + make + ", made in " + year);
	}
	
}
