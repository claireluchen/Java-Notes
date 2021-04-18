package Collection;

import java.util.Vector;

/*
Vector and ArrayList use arrays internally as data structure 
Vector defaults to doubling the size of its array, while the ArrayList increases its size by 50 percent
Vector contains synchronized methods for accessing and modifying the vector.
Extends AbstractList class
 */
public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(); //create a new vector object
		//append the elements to the end of the vector, can also use add() method that overrides add() in AbstractList
		vector.addElement(1);
		vector.addElement(2);
		vector.addElement(3);
		vector.addElement(4);
		System.out.println(vector.size()); //4
		System.out.println(vector.capacity()); //10, default capcity
		vector.trimToSize(); //trims capacity to size
		System.out.println(vector.capacity()); //4
	
		vector.remove(0); //removes the element at the specified position, returns the element
		if (vector.contains(1)) {
			vector.removeElement(1); //removes the first occurrence of the argument
		}
		vector.removeElementAt(0);//removes the element at the specified position
		System.out.println(vector.firstElement()); //3
		vector.insertElementAt(10, 1);
		System.out.println(vector); //[3, 10, 4]
		
	}

}
