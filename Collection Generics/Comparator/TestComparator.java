package Comparator;

import java.util.Comparator;

import GeometricObject.*;

public class TestComparator {

	public static void main(String[] args) {
		GeometricObject o1 = new Rectangle(5, 5);
		GeometricObject o2 = new Circle(5);
		GeometricObject g = max(o1, o2, new GeometricObjectComparator()); //invoke max
		System.out.println(g.getArea());
		
		//use the Lambda expression
		//g1 and g2 are two parameters in the compare method in the Comparator interface
		//returns 1 if o1.getArea() > o2.getArea(), 0 is o1.getArea() == o2.getArea(), -1 otherwise
		//c.compare(o1, o2) can be substituted with 1, 0, or -1
		GeometricObject go = max(o1, o2, (g1, g2) -> g1.getArea() > g2.getArea() ? 1 : g1.getArea() < g2.getArea() ? -1 : 0);
		System.out.println(go.getArea());
	}
	
	//find the max method
	public static GeometricObject max(GeometricObject o1, GeometricObject o2, Comparator<GeometricObject> c) {
		if (c.compare(o1, o2) >= 0) { //invoke compare
			return o1;
		}else {
			return o2;
		}
	}

}
