package Unit10Inheritance;
/**
 * This class overrides the inherited update() method and displays message for Subscriber 1 when update() is invoked
 * @author Lu Chen
 *
 */
public class MySubscriber1 extends Subscriber{
	//default/no-arg constructor
	public MySubscriber1() {}
	
	@Override
	/**
	 * This update() method displays customized message, Subscriber 1 has been notified, onto the screen
	 */
	public void update() {
		System.out.println("Subscriber 1 has been notified");
	}
}
