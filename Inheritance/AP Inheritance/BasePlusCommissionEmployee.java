package Unit10Inheritance;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary; //base salary per week
	
	//six argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double gross, double rate, double baseSalary) {
		super (firstName, lastName, socialSecurityNumber, gross, rate);
		if (baseSalary < 0) {
			throw new IllegalArgumentException("Base salary must be >= 0");
		}
		this.baseSalary = baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0) {
			throw new IllegalArgumentException("Base salary must be >= 0");
		}
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary() {return baseSalary;}
	
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nBase salary: " + baseSalary;
	}
	
}
