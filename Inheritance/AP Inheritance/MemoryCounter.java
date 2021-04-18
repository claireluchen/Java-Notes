package Unit10Inheritance;
/**
 * This MemoryCounter extends Counter class
 * It adds additional attribute: memoryValue
 * It adds additional behaviors: resetMemory(), addMemory()
 * @author Lu Chen
 * 
 */
public class MemoryCounter extends Counter {
	private int memoryValue;
	
	//default constructor
	public MemoryCounter() {}
	//constructor with two values specified
	public MemoryCounter(int counterValue, int memoryValue) {
		super(counterValue); //invoke superclass constructor
		this.memoryValue = memoryValue;
	}
	
	//mechanism to increment, decrement, reset the current count is inherited from Counter class
	
	/**
	 * This method displays the memory count value to the console
	 * precondition: a counter object is created
	 * postcondition: the current memory count is displayed
	 */
	public void displayMemoryValue() {
		System.out.println("The current memory count value is: " + getMemoryValue());
	}
	
	/**
	 * This method returns the count of the counter
	 * @return int, count
	 * precondition: a counter object is created
	 * postcondition: the current count of the counter is returned
	 */
	public int getMemoryValue() {
		return memoryValue;
	}
	
	/**
	 * This method adds to the memory count value. The amount added is the current count
	 * @param value, int
	 * precondition: an integer value is passed to the method
	 * postcondition: the value passed is added to the memory count value
	 */
	public void addMemory() {
		memoryValue += getCount();
	}
	
	
	/**
	 * This method adds to the memory count value with specified value. Should not be used
	 * @param value, int
	 * precondition: an integer value is passed to the method
	 * postcondition: the value passed is added to the memory count value
	 */
	public void addMemory(int value) {
		memoryValue += value;
	}
	
	
	/**
	 * This method resets the memory value
	 * precondition: an MemoryCounter object is created
	 * postcondition: the memory count value is reset to 0
	 */
	public void resetMemory() {
		memoryValue = 0;
	}

}
