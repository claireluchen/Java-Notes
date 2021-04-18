import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectGroupDemo {

	public static void main(String[] args) {
		//create an array
		String[] names = {"John", "Peter", "Susan", "Kim", "Jen", "George", "Alam", "Stacy", "Steve"};
		
		//grouping by individual names
		Map<String, Long> map1 = Stream.of(names).map(e -> e.toUpperCase()).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(map1); //{JEN=1, GEORGE=1, SUSAN=1, ALAM=1, JOHN=1, STEVE=1, PETER=1, STACY=1, KIM=1}
		
		//grouping by individual names, storing in a TreeMap
		Map<String, Long> map2 = Stream.of(names).collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting()));
		System.out.println(map2); //{Alam=1, George=1, Jen=1, John=1, Kim=1, Peter=1, Stacy=1, Steve=1, Susan=1}

		//grouping by first letter only, storing in a TreeMap
		Map<Character, Long> map3 = Stream.of(names).collect(Collectors.groupingBy(e -> e.charAt(0), TreeMap::new, Collectors.counting()));
		System.out.println(map3); //{A=1, G=1, J=2, K=1, P=1, S=3}
		
		//int array
		int[] values = {2, 3, 4, 1, 6, 2 ,6, 1, 1, 3, 22};
		IntStream.of(values).mapToObj(e -> e).collect(Collectors.groupingBy(e -> e, TreeMap::new, Collectors.counting())).forEach((k, v) -> System.out.println(k +" occurs " + v + (v > 1 ? " times" : " time")));
		
		MyStudent[] students = {new MyStudent("John", "Lu", "CS", 32, 78), new MyStudent("Lucas", "Smith", "Math", 22, 68), new MyStudent("Kim", "Johnson", "CS", 30, 79.5)};
		//calculate the department average
		Stream.of(students).collect(Collectors.groupingBy(MyStudent::getMajor, TreeMap::new, Collectors.averagingDouble(MyStudent::getScore))).forEach((k, v) -> System.out.println(k + ": " + v));
		
	}

}

//Student class
class MyStudent{
	private String firstName;
	private String lastName;
	private String major;
	private int age;
	private double score;
	
	public MyStudent(String f, String l, String m, int a, double s) {
		firstName = f;
		lastName = l;
		major = m;
		age = a;
		score = s;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getMajor() {
		return major;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getScore() {
		return score;
	}
	
}



