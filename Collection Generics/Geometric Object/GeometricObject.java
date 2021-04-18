package GeometricObject;
//create a superclass that defines the date, color, whether a shape is filled
//do be used by other subclasses
public abstract class GeometricObject {
	//data fields
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//construct a default geometric object
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	//construct a geometric object with the specified color and filled value
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	//return color
	public String getColor() {
		return color;
	}

	//set color
	public void setColor(String color) {
		this.color = color;
	}
	
	//return filled
	//since filled is a boolean, its getter method is named isFilled
	public boolean isFilled() {
		return filled;
	}
	
	//set filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//get dateCreated
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	//return a string representation of this object
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
}
