package Unit11Collections;
/**
 * This Cat class extends Pet class
 * It overrides the wound() method in Pet class
 * @author Lu Chen
 *
 */
public class Cat extends Pet{	
	//default constructor
	public Cat() {}
	//constructor with three arguments
	public Cat(String name, double weight, int age) {
		super(name, weight, age);
	}
	
	
	@Override
	//display the sound to the screen
	public void sound() {
		System.out.println("Sound: Meow");
	}
}
