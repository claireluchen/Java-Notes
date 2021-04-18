package Assignment2Vehicle;
/*
Extends the Vehicle abstract class
- provide definition for the display() method
- data attribute: length, draft
- method: display() "boat object" + length + draft
- getter, setter, 2 constructors
 */
public class Boat extends Vehicle{
	//data field
	private double length;
	private double draft;
	
	//default constructor
	public Boat() {
		
	}
	
	//constructor with parameters length and draft
	public Boat(double length, double draft) {
		this.length = length;
		this.draft = draft;
	}
	
	//get the length
	public double getLength() {
		return length;
	}
	
	//set the length
	public void setLength(double length) {
		this.length = length;
	}
	
	//get the draft
	public double getDraft() {
		return draft;
	}
	
	//set the length
	public void setDraft(double draft) {
		this.draft = draft;
	}
	
	//display method
	@Override
	public void display() {
		System.out.println("This is a Boat object, the length is " + length + "m, the draft is " + draft + "m");
	}
	
	
}
