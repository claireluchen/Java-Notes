//subclass from GeometricObject
//inherits methods from its superclass
//a circle class that includes properties of a circle

//extends superclass data fields
public class Circle extends GeometricObject{
	//data field
	private double radius;
	
	//default constructor
	public Circle() {
	}
	
	//constructor with radius
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//constructor with radius, color, filled
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color); //set the new color in the GeometricObject
		setFilled(filled); //set the filled in the GeometricObject
	}
	
	//return radius
	public double getRadius() {
		return radius;
	}
	
	//set new radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//return area
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	//return diameter
	public double getDiameter() {
		return radius * 2;
	}
	
	//return perimeter
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	//print the circle info
	//using data field created in this class
	//also using color and filled from the super class
	//can use super.getDateCreated() to be more precise, inheriting from its superclass
	public void printCircle(){
		System.out.println("The circle is created on " + getDateCreated() + " and the radius is " + radius + 
				" is the circle filled? " + isFilled() + " the color is " + getColor());
	}
	
	//override the toString method defined in the superclass
	//the toString() method is defined in the GeometricObject superclass
	//toString() is then modified in this Circle subclass
	//both methods can be used in the Circle class
	//to invoke the toString method defined in the GeometricObject class from the Circle class
	//use super.toString()
	
	//the following code overrides the default toString() defined in Object class
	//by default, toString() returns a string consisting of a class name of which the object is an instance
	//an @ sign, and the object's memory address in hexadecimal
	//note that System.out.println(object) is equivalent to System.out.println(object.toString())
	//ex: Loan@15037e5
	
	//use @Override annotation before the overriding method in the subclass
	//if a method with this annotation does not override its superclass method, an error is reported
	@Override
	public String toString() {
		return super.toString() + "\n radius is " + radius;
	}
	
	//override the equals method in the Circle class to compare whether two circles are equal based on their radius
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Circle) {
			//if it's part of the Circle object
			//compare their radii to see if they're equal, return
			return radius == ((Circle)o).radius;
		}else {
			return false;
		}
	}
	
}
