package LessonAbstract;

public class Robin extends Animal{
	@Override
	public void display() {
		System.out.println("Chiwawa");
	}
	
	//its own method
	public void chirp() {
		System.out.println("chirp");
	}
}
