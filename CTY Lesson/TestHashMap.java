package Lesson;
//the entries are not ordered
import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "table");
		map.put(2, "desk");
		map.put(3, "paper");

		System.out.println(map); //{1=table, 2=desk, 3=paper}

		map.forEach((i, s) -> System.out.println(map.get(i)));
		
		for (Map.Entry<Integer, String> element : map.entrySet()) { //print out the entries
			System.out.println(element.getKey() + ": " + element.getValue());
		}
		
		for (Map.Entry<Integer, String> element : map.entrySet()) { //print out the entries
			if (element.getValue() == "paper") {
				System.out.println("The key of paper is " + element.getKey());
			}
		
		}
	}

}
