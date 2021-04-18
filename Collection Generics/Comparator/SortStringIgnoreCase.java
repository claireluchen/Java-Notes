package Comparator;

public class SortStringIgnoreCase {

	public static void main(String[] args) {
		java.util.List<String> cities = java.util.Arrays.asList("aaaa", "Ccccc", "Bbb");
		
		cities.sort(String:: compareToIgnoreCase); //method reference, same as: cities.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
		for (String s : cities) {
			System.out.print(s + " ");
		}
		
		
	}

}
