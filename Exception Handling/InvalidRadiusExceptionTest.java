
public class InvalidRadiusExceptionTest {

	public static void main(String[] args) {
		
		try {
			new CircleWithCustomException(5);
			new CircleWithCustomException(-5);
		
			new CircleWithCustomException(0);
		}
		catch (InvalidRadiusException ex) {
			System.out.println(ex);
		}
		System.out.println("Number of objects created: " + CircleWithCustomException.getNumberOfObjects());
		
		/*
		InvalidRadiusException: Invalid radius -5.0
		Number of objects created: 1
		*/
		
	}

}

class CircleWithCustomException{
	//the radius of the circle
	private double radius;
	
	//number of objects created
	private static int numberOfObjects = 0;
	
	//construct a circle with radius 1
	public CircleWithCustomException() throws InvalidRadiusException{
		this (1.0);
	}
	
	//construct a circle with given radius
	public CircleWithCustomException(double radius) throws InvalidRadiusException{
		setRadius(radius);
		numberOfObjects++;
	}
	
	//set radius, throw exception
	//since the InvalidRadiusException is a checked exception, it must be declard in the header
	public void setRadius(double radius) throws InvalidRadiusException {
		if (radius >= 0) {
			this.radius = radius;
		}else {
			throw new InvalidRadiusException(radius);
		}	
	}
	
	//get radius
	public double getRadius() {
		return radius;
	}
	
	//get number of objects
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
}
