import java.util.HashMap;
import java.util.Map;

public class MapFunctions {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		//add entries to the map
		map.put("Student 1", 99);
		map.put("Student 2", 90);
		map.put("Student 3", 95);
		
		//get the grade of student 1
		int student1Grade = map.get("Student 1");
		System.out.println(student1Grade);
		
		//set the value of the key
		//doesn't provide set method, so put in a new entry since map only allows distinct key
		map.put("Student 1", 98);
		student1Grade = map.get("Student 1");
		System.out.println(student1Grade);
		
		map.remove("Student 2"); //remove the indicated entry
		map.size(); //get the number of entries
		
		//print key
		for (String i : map.keySet()) {
		  System.out.println(i);
		}
		
		//print value
		for (int i : map.values()) {
			System.out.println(i);
		}
		
		//traversing through the map 
        for (Map.Entry<String, Integer> entry : map.entrySet()) { 
        	System.out.print(entry.getKey() + ": "); 
            System.out.println(entry.getValue()); 
        } 
		
	}

}
