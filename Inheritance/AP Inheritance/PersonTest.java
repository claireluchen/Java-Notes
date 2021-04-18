package Unit10Inheritance;
/**
 * This program creates a Person, Student, Employee, Faculty, Staff object and invokes their toString() methods
 * @author Lu Chen
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		Person person = new Person("Liam", "ABCRoad123", "abc@gmail.com", "123-000-0000", 1, 2, 2003);
		Student student = new Student("Olivia", "DEFRoad234", "def@gmail.com", "234-000-0000", 2, 3, 2004, "freshman");
		Employee employee = new Employee("Noah", "GHIRoad345", "ghi@gmail.com", "345-000-0000", 3, 4, 1995, 3456, new Date(8, 9, 2010));
		Faculty faculty = new Faculty("Emma", "JKLRoad456", "jkl@gmail.com", "456-000-0000", 4, 5, 1986, 8900, new Date(4, 5, 2008), "10 to 3", "assistant professor");
		Staff staff = new Staff("James", "MNORoad567", "mno@gmail.com", "567-000-0000", 5, 6, 1987, 7890, new Date(2, 3, 2000), "teacher");
		
		//invoke the toString method
		display(person);
		display(student);
		display(employee);
		display(faculty);
		display(staff);
	
	}
	
	public static void display(Person per) {
		System.out.println(per.toString());
	}

}
