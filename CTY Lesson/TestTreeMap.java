package Lesson;
//the entries are ordered based on the key
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(3, "paper");
		map.put(1, "table");
		map.put(2, "desk");

		System.out.println(map); //{1=table, 2=desk, 3=paper}
		System.out.println(map.firstEntry()); //1=table
		for (Map.Entry<Integer, String> element : map.entrySet()) {
			System.out.println(element.getKey() + ": " + element.getValue());
		}
	}

}
