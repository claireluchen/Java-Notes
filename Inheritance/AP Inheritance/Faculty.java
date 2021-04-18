package Unit10Inheritance;
/**
 * This Faculty extends the Employee class, adds additional officeHours and rank
 * @author Lu Chen
 *
 */
public class Faculty extends Employee{
	//data field
	private String officeHours;
	private String rank;
	
	public Faculty() {}
	public Faculty(String name, String address, String emailAddress, String phoneNumber, Date birthDate, double salary, Date hireDate, String officeHours, String rank) {
		super(name, address, emailAddress, phoneNumber, birthDate, salary, hireDate);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	public Faculty(String name, String address, String emailAddress, String phoneNumber, int month, int day, int year, double salary, Date hireDate, String officeHours, String rank) {
		super(name, address, emailAddress, phoneNumber, month, day, year, salary, hireDate);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	//setter and getter for office hours
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getOfficeHours() {
		return officeHours;
	}
	//setter and getter for rank
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getRank() {
		return rank;
	}
	
	//Override the toString() method, display the class name and the person¡¯s name
	@Override
	public String toString() {
		return getClass().getName() + ", person name: " + getName();
	}
}
