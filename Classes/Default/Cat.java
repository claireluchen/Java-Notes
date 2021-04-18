package Unit8Class;
/**
 * This class modifies a Cat
 * It contains attributes of a cat and has two methods that represent its behaviors
 * @author Lu Chen
 *
 */
public class Cat {
	//data field
	private String breed;
	private int age;
	private double weight;
	private char sex;
	private String name;
	
	//default constructor
	public Cat() { }
	//override default constructor
	public Cat(String breed, int age, double weight, char sex, String name) {
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
	}
	
	//setter method for breed
	protected void setBreed(String breed) {
		this.breed = breed;
	}
	
	//getter method for breed
	public String getBreed() {
		return breed;
	}
	
	//setter method for age
	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		}else {
			System.out.println("Age cannot be negative");
		}
	}
	
	//getter method for age
	public int getAge() {
		return age;
	}
	
	//setter method for weight
	public void setWeight(double weight) {
		if (weight >= 0) {
			this.weight = weight;
		}else {
			System.out.println("Weight cannot be negative");
		}
	}
	
	//getter method for weight
	public double getWeight() {
		return weight;
	}
	
	//setter method for sex
	public void setSex(char sex) {
		if (sex != 'm' && sex != 'f') {
			System.out.println("Sex has to be 'm' or 'f'");
		}else {
			this.sex = sex;
		}
	}
	
	//getter method for sex
	public char getSex() {
		return sex;
	}
	
	//setter method for name
	public void setName(String name) {
		this.name = name;
	}
	
	//getter method for name
	public String getName() {
		return name;
	}	
	
	/**
	 * meow() method, returns a String
	 * @return String, "Meeeeeooww"
	 */
	public String meow() {
		return "Meeeeeooww";
	}
	
	/**
	 * eat() method, returns a String
	 * @return String, "Munch, Munch, Munch"
	 */
	public String eat() {
		return "Munch, Munch, Munch";
	}
	
	/**
	 * Displays the information about the Cat object
	 * Including its breed, age, weight, sex, name
	 */	
	public void displayInfo() {
		System.out.println("The name of the cat is: " + name);
		System.out.println("The breed of the cat is: " + breed);
		System.out.println("The age of the cat is: " + age);
		System.out.println("The weight of the cat is: " + weight);
		if (sex == 'm') {
			System.out.println("The sex of the cat is: male");
		}else {
			System.out.println("The sex of the cat is: female");
		}
	}
	
	
}
