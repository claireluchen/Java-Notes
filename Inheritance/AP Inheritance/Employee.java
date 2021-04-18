package Unit10Inheritance;
/**
 * This Employee class extends Person class, provides additional salary and hireDate attributes
 * @author Lu Chen
 *
 */
public class Employee extends Person{
	private double salary;
	private Date hireDate;
	
	//constructor
	public Employee() {}
	public Employee(String name, String address, String emailAddress, String phoneNumber, Date birthDate, double salary, Date hireDate) {
		super(name, address, emailAddress, phoneNumber, birthDate);
		this.salary = salary;
		this.hireDate = hireDate;
	}
	public Employee(String name, String address, String emailAddress, String phoneNumber, int month, int day, int year, double salary, Date hireDate) {
		super(name, address, emailAddress, phoneNumber, month, day, year);
		this.salary = salary;
		this.hireDate = hireDate;
	}
	
	//setter and getter for salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	
	//setter and getter for hireDate
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public void setHireDate(int m, int d, int y) {
		hireDate = new Date(m, d, y);
	}
	public String getHireDate() {
		return hireDate.dateString();
	}
	
	//Override the toString() method, display the class name and the person¡¯s name
	@Override
	public String toString() {
		return getClass().getName() + ", person name: " + getName();
	}
	
}
