package Unit10Inheritance;
/**
 * This person class provides attributes that modify a person
 * @author Lu Chen
 *
 */
public class Person {
	//data field
	private String name;
	private String address;
	private String emailAddress;
	private String phoneNumber;
	private Date birthDate;
	
	//constructors
	public Person() {}
	public Person(String name, String address, String emailAddress, String phoneNumber, Date birthDate) {
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
	}
	public Person(String name, String address, String emailAddress, String phoneNumber, int month, int day, int year) {
		this.name = name;
		this.address = address;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		birthDate = new Date(month, day, year);
	}	
	
	//setter and getter for name attribute
	public void setName(String name) {this.name = name;}
	public String getName() {return name;}
	
	//setter and getter for address attribute
	public void setAddress(String address) {this.address = address;}
	public String getAddress() {return address;}
	
	//setter and getter for email address attribute
	public void setEmailAddress(String emailAddress) {this.emailAddress = emailAddress;}
	public String getEmailAddress() {return emailAddress;}
	
	//setter and getter for phone number attribute
	public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
	public String getPhoneNumber() {return phoneNumber;}
	
	//setter and getter for birth date attribute
	public void setBirthDate(Date birthDate) {this.birthDate = birthDate;}
	public void setBirthDate(int month, int day, int year) {birthDate = new Date(month, day, year);}
	public Date getBirthDate() {return birthDate;}
	
	//Override the toString() method, display the class name and the person¡¯s name
	@Override
	public String toString() {
		return getClass().getName() + ", person name: " + getName();
	}
	
}
