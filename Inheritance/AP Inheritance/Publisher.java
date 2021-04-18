package Unit10Inheritance;
/**
 * The Publisher class maintains a list of Subscriber objects 
 * register() method allows a Subscriber object to register to be notified of state changes
 * unregister() method allows a Subscriber object to unsubscribe to state change notifications
 * notify() method will be invoked whenever a state change occurs
 * notifySubscribers() method goes through the list of registered Subscriber objects and invoke their update() method. 
 * @author Lu Chen
 *
 */
public class Publisher {
	private Subscriber[] subscriberList; //array used to store subscribers
	private int maximumSubscribers; //max number of subscribers
	private int nextIndex; //array index of next subscriber
	
	//constructor
	public Publisher(int max) {
		//initialize attributes and create subscriber array
		maximumSubscribers = max;
		subscriberList = new Subscriber[maximumSubscribers];
		nextIndex = 0;
	}
	
	/**
	 * This method registers a subscriber to receive updates
	 * @param e, Subscriber
	 */
	public void register(Subscriber e) {
		if (nextIndex < maximumSubscribers) { //list not full yet
			subscriberList[nextIndex++] = e;
		}else {
			System.out.println("ERROR: Subscriber List is full");
		}
	}
	
	/**
	 * This method notifies the subscribers and invoke their update() method
	 */
	public void notifySubscribers() {
		//iterate through the subscriber array while there's element stored
		for (int i = 0; i < nextIndex; i++) { 
			subscriberList[i].update();
		}
	}
}
