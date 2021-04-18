/*
setRadius(double newRadius) method throws an IllegalArgumentException if the argument newRadius is negative
 */
public class CircleWithException {
	//The radius of the circle
	private double radius;
	
	//the number of objects created
	private static int numberOfObjects = 0;
	
	//construct a circle with radius 1
	public CircleWithException() {
		this(1.0);
	}
	
	//construct a circle with specified radius
	public CircleWithException(double radius) {
		setRadius(radius);
		numberOfObjects++;
	}
	
	//set radius
	//throw exception if the radius is negative
	//the exception is declared in the header here
	//it can be removed since IllegalArgumentException is a Runtime error and every code can generate Runtime error
	public void setRadius(double radius) throws IllegalArgumentException{ //declare exception in header
		if (radius >= 0) {
			this.radius = radius;
		}else {
			//runtime exception, doesn't have to include try-catch, but it's included
			throw new IllegalArgumentException("Radius cannot be negative");
		}
		
	}	
	
	//return radius
	public double getRadius() {
		return radius;
	}
	
	//return number of objects
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	//return area
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	//return perimeter
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
}
