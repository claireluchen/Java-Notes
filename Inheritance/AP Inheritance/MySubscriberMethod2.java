package Unit10Inheritance;
/**
 * This class overrides the inherited update() method and displays message when update() is invoked
 * @author Lu Chen
 *
 */
public class MySubscriberMethod2 extends Subscriber{
	private static int count = 0; //keep track of the number of subscribers created
	private int number; //keep track of the subscriber number
	
	//default/no-arg constructor
	public MySubscriberMethod2() {
		count++; //add one to the count
		number = count; //assign the count to the subscriber number
		
	}
	
	/**
	 * This update() method displays customized message, SubscriberX has been notified, onto the screen
	 * The X depends on the object
	 */
	public void update() {
		System.out.println("Subscriber " + number + " has been notified");
	}
	
}
