package Unit11Collections;
/**
 * This class models a Car
 * It has three attributes: make, model, year
 * It provides methods to retrieve and modify them
 * The displayInfo() displays the full information
 * @author lu
 *
 */
public class Car {
	//data field attributes
	private String make;
	private String model;
	private int year;
	
	//default constructor
	public Car() {}
	//constructor with 3 arguments
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	//getter and setter for make
	public void setMake(String make) {
		this.make = make;
	}
	public String getMake() {
		return make;
	}
	
	//getter and setter for model
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	
	//getter and setter for year
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	//this displayInfo method displays the attributes of the car
	public void display() {
		System.out.println("Maker: " + getMake() + ", Model: " + getModel() + ", Year: " + getYear());
	}
	
}
