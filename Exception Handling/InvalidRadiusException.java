//throw an exception if the radius is negative

public class InvalidRadiusException extends Exception{
	private double radius;
	//all the methods (e.g. getMessage(), toString(), printStackTrace()) are inherited from Throwable
	//4 constructors are defined in the Exception class
	
	//construct an exception
	public InvalidRadiusException(double radius) {
		//invokes the superclass's constructor with a message
		//this message will be set in the exception object and obtained by getMessage() on the object
		super ("Invalid radius " + radius); 
		this.radius = radius;
	}
	
	//return the radius
	public double getRadius() {
		return radius;
	}
	
	
}
