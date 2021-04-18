package Unit11Collections;

/**
 * This Dog class extends Pet class
 * It overrides the wound() method in Pet class
 * @author Lu Chen
 *
 */
public class Dog extends Pet{
	//default constructor
	public Dog() {}
	//constructor with three arguments
	public Dog(String name, double weight, int age) {
		super(name, weight, age);
	}
		
		
	@Override
	//display the sound to the screen
	public void sound() {
		System.out.println("Sound: Bow wow");
	}
}
