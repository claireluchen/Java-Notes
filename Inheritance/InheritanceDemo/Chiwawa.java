package LessonInheritance;

/*
implementing method declarations inherited from abstract class Dog
abstract class Dog inherited its abstract methods by implementing 2 interfaces
 */
public class Chiwawa extends Dog{
	public void play() {
		System.out.println("Play");
	}
	
	public void doTricks() {
		System.out.println("Doing tricks");
	}
	
	public void drawn() {
		System.out.println("Drawing");
	}
	
	public static void main(String[] args) {
		Chiwawa chi = new Chiwawa();
		chi.play(); //play
		chi.doTricks(); //doing tricks
		chi.drawn(); //drawing
	}
}
