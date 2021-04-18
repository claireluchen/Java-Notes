package SetsMaps;

import java.util.Set;
import java.util.TreeSet;

import Comparator.GeometricObjectComparator;
import GeometricObject.*;

public class TestTreeSetComparator {

	public static void main(String[] args) {
		//create a tree set for geometric objects using a comparator
		Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
		set.add(new Rectangle(4, 5));
		set.add(new Circle(40));
		set.add(new Rectangle(3, 5));
		set.add(new Circle(40));
		
		//display the geometric objects in the tree set
		System.out.println("A sorted set of geometric objects");
		for (GeometricObject element: set) {
			System.out.println("area = " + element.getArea()); 
		}
		/*
		A sorted set of geometric objects
		area = 15.0
		area = 20.0
		area = 5026.548245743669, set does not allow duplicates, determined by comparator in this case
		 */
		
	}

}
