package LessonInheritance;

public class CatPolymorphic implements DrawandRotate{
	public void draw() {
		System.out.println("draw a cat");
	}
	public void rotate() {
		System.out.println("rotate a cat");
	}
	
	public static void main(String[] args) {
		//create an array of type DrawandRotate
		//2 elements, one is an object of CatPolymorphic, one is an object of Tree
		DrawandRotate[] array = {new CatPolymorphic(), new Tree()};
		for (int i = 0; i < array.length; i++) {
			//polymorphism, employing method with the same name but from different classes depending of the actual type
			array[i].draw();
			array[i].rotate();
		}
	}
}

class Tree implements DrawandRotate{
	public void draw() {
		System.out.println("draw a tree");
	}
	public void rotate() {
		System.out.println("rotate a tree");
	}
}
