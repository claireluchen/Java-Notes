package Unit10Inheritance;
/**
 * This class notifies its subscribers when the count is three or greater
 * @author Lu Chen
 *
 */
public class MyPublisher extends Publisher {
	private int count; //keep track of the count
	
	public MyPublisher(int max) {
		super(max);
		count = 0;
	}
	
	/** This method increments one to the count, notifies its subscribers if the count >= 3 */
	public void increment() {
		count++;
		//notify subscribers if count >= 3
		if (count >= 3) {
			notifySubscribers();
		}
	}
	
	
}
