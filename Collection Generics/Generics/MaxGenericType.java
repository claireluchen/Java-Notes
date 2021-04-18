package Generics;

public class MaxGenericType {
	//return the maximum of two objects
	public static <E extends Comparable<E>> E max (E o1, E o2) {
		if (o1.compareTo(o2) > 0) {
			return o1;
		}else {
			return o2;
		}
	}
	
	
	public static void main(String[] args) {
		int max = max(1, 2);
		System.out.println(max); //2
	}

}
