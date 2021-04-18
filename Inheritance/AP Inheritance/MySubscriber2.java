package Unit10Inheritance;

/**
 * This class overrides the inherited update() method and displays message for Subscriber 2 when update() is invoked
 * @author Lu Chen
 *
 */
public class MySubscriber2 extends Subscriber{
	//default/no-arg constructor
	public MySubscriber2() {}
	
	@Override
	/**
	 * This update() method displays customized message, Subscriber 1 has been notified, onto the screen
	 */
	public void update() {
		System.out.println("Subscriber 2 has been notified");
	}
}
