package LessonAbstract;

public class EnglishSpaniel extends Dog{
		//defines the display() method in Dog class
		public void display() {
			System.out.println("Displaying EnglishSpaniel");
		}
		
		//defines the bark() method in abstract Animal class, inherited by abstract dog class
		public void bark() {
			System.out.println("EnglishSpaniel barking");
		}
		
		public static void main(String[] args) {
			EnglishSpaniel dog = new EnglishSpaniel();
			dog.display(); //Displaying EnglishSpaniel
			dog.bark(); //EnglishSpaniel barking
		}
}
