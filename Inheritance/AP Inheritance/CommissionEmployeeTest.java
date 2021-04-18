package Unit10Inheritance;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Claire", "Chen", "1341016", 10000, 0.2, 1000);
		System.out.println("The social security number is, using method from the superclass: " + employee.getSocialSecurityNumber());
		System.out.println(employee.toString());
		System.out.println(employee.earnings());
	}

}
