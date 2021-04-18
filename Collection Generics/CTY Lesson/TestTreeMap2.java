package Lesson;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap2 {

	public static void main(String[] args) {
		TreeMap<Integer, Office> map = new TreeMap<>();
		
		Office p1 = new Office(102, "Staples", 2.95);
		Office p2 = new Office(100, "Paper", 0.5);
		Office p3 = new Office(103, "Chair", 10.3);
		
		map.put(p1.getCode(), p1);
		map.put(p2.getCode(), p2);
		map.put(p3.getCode(), p3);
		
		for (Map.Entry<Integer, Office> element : map.entrySet()) {
			Office p = map.get(element.getKey());
			Office pro = element.getValue();
			System.out.println(pro.getCode() + ": " + pro.getName() + ", " + pro.getPrice());
		}
	}

}

class Office{
	private int code;
	private String name;
	private double price;
	public Office(int c, String n, double p) {
		code = c;
		name = n;
		this.price = p;
	}
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
}