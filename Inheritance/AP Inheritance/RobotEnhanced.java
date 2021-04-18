package Unit10Inheritance;

public class RobotEnhanced extends Robot{
	private String modelNumber;
	
	public RobotEnhanced(String name, String modelNumber) {
		super(name);
		this.modelNumber = modelNumber;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("My model number is " + modelNumber);
	}
	
	
}
