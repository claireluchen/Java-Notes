package Unit9Class;
/**
 * This class models a counter. It can increment, decrement, or reset the count
 * @author Lu Chen
 *
 */
public class Counter {
	//data field
	private int count; //keep track of the count
	
	//default constructor
	public Counter() {
		count = 0;
	}
	
	//constructor that sets the counter to the indicated value
	public Counter(int c) {
		count = c;
	}
	
	/**
	 * This method increments the counter by 1
	 * precondition: a counter object is created
	 * postcondition: the counter is incremented by 1
	 */
	public void increment() {
		count++;
	}
	
	/**
	 * This method decrements the counter by 1
	 * precondition: a counter object is created
	 * postcondition: the counter is decremented by 1
	 */
	public void decrement() {
		count--;
	}
	
	/**
	 * This method resets the counter to zero
	 * precondition: a counter object is created
	 * postcondition: the counter is reseted to zero
	 */
	public void reset() {
		count = 0;
	}
	
	/**
	 * This method returns the count of the counter
	 * @return int, count
	 * precondition: a counter object is created
	 * postcondition: the current count of the counter is returned
	 */
	public int getCount() {
		return count;
	}
	
}
