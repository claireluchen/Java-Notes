import GeometricObject.Circle;
import GeometricObject.GeometricObject;
import GeometricObject.Rectangle;

public class BoundedTypeDemo {

	public static void main(String[] args) {
		Circle circle = new Circle(2);
		Rectangle rectangle = new Rectangle(2, 3);
		
		System.out.println(equalArea(circle, rectangle)); //false
	}
	
	//bounded generic type: a generic type specified as a subtype of another type
	public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
		return object1.getArea() == object2.getArea();
	}

}
