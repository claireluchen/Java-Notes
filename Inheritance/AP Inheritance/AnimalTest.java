package Unit10Inheritance;

class Animal {
}

class Dog2 extends Animal{
	public void bark() {System.out.println("This is a dog");}
}

class Cat2 extends Animal{
	public void meow() {System.out.println("This is a cat");}
}

public class AnimalTest{
	public static void main(String[] args) {
		Animal[] array = new Animal[10];
		//assign cat or dog object to the array randomly
		for (int i = 0; i < array.length; i++) {
			int num = (int) (Math.random() * 10);
			if (num % 2 == 0) {
				array[i] = new Cat2();
			}else {
				array[i] = new Dog2();
			}
		}
		
		for (Animal animal : array) {
			if (animal instanceof Cat2) {
				((Cat2) animal).meow(); //cast animal to cat
			}else if (animal instanceof Dog2){
				((Dog2) animal).bark(); //cast animal to dog
			}
		}
		
	}
}
