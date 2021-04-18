package Unit10Inheritance;

public class Robot {
	private String robotName;
	
	//constructor
	public Robot(String name) {
		robotName = name;
	}
	
	//display the name
	public void display() {
		System.out.println("I am a robot named " + robotName);
	}
	
}
