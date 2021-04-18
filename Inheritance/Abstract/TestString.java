package LessonAbstract;

public class TestString{
	private int x;
	private int y;
	
	public TestString(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//override the inherited toString() method in the object class
	//provide name of the class and the name of the two data members
	
	public String toString(Object obj) {
		return obj.getClass().getName() + " " + x + " " + y;
	}
	
	public static void main(String[] args) {
		TestString obj1 = new TestString(20, 30);
		System.out.println(obj1.toString(obj1)); //Lesson.TestString 20 30
	}
	
}
