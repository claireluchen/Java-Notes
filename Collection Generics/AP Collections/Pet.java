package Unit11Collections;
/**
 * This Pet class provides three attributes shared by all pets
 * It provides one behavior: sound(), which is a no-op method. The implementation differs depending on the subclass
 * @author Lu Chen
 *
 */
public class Pet {
	//data field
	private String name;
	private double weight;
	private int age;
	
	//default constructor
	public Pet() {}
	//constructor with three argument
	public Pet(String name, double weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	//getter and setter for name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	//getter and setter for weight
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	//getter and setter for age
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	

	//display the sound to the screen
	//no-op method, to be determined by subclasses
	public void sound() {
		
	}
	
	//display the entire info
	public void displayAttributeInfo() {
		System.out.println("Name: " + getName());
		System.out.println("Weight: " + getWeight());
		System.out.println("Age: " + getAge());
	}	
	
}