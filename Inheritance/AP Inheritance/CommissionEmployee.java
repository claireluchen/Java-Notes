package Unit10Inheritance;

public class CommissionEmployee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSales; //gross weekly sales
	private double commissionRate; //commission percentage
	
	//five argument constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double gross, double rate) {
		//implicit call to Object constructor occurs here
		
		
		if (gross < 0 && rate < 0) {
			throw new IllegalArgumentException("Gross sales and rate must be >= 0");
		}
		if (gross < 0) {
			throw new IllegalArgumentException("Gross sales must be >= 0");
		}
		if (rate < 0){
			throw new IllegalArgumentException("Commission rate must be >= 0");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		//gross sale and rate entered are valid
		grossSales = gross;
		commissionRate = rate;
	}
	
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String getSocialSecurityNumber() {return socialSecurityNumber;}
	public double getGrossSales() {return grossSales;}
	public double getCommissionRate() {return commissionRate;}
	
	//set gross sales amount
	public void setGrossSales(double gross) {
		if (gross < 0) {
			throw new IllegalArgumentException("Gross sales must be >= 0");
		}
		grossSales = gross;
	}
	
	//set commission rate
	public void setCommissionRate(double rate) {
		if (rate < 0){
			throw new IllegalArgumentException("Commission rate must be >= 0");
		}
		commissionRate = rate;
	}
	
	public double earnings() {return getCommissionRate() * getGrossSales();}
	
	@Override
	public String toString() {
		return "Employee: " + firstName + " " + lastName + "\nSocial security number: " + socialSecurityNumber + "\nGross sales: " + grossSales + "\nCommission rate: " + commissionRate;
	}
	
}
