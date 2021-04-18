package Unit10Inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number of pets you'd like to create: " );
		int num = in.nextInt();
		
		//create an array that stores Pet objects
		Pet[] petArray = new Pet[num];
		for (int i = 0; i < petArray.length; i++) {
			System.out.print("Please enter \"cat\" to create a cat, enter \"dog\" to create a dog: ");
			String catOrDog = in.next();
			if (catOrDog.equals("cat")) { //create a Cat object
				System.out.print("Please enter the name: ");
				String name = in.next();
				System.out.print("Please enter the weight: ");
				double weight = in.nextDouble();
				System.out.print("Please enter the age: ");
				int age = in.nextInt();
				//make the Pet reference to a Cat object
				petArray[i] = new Cat(name, weight, age);
			}else if (catOrDog.equals("dog")) { //create a Dog object
				System.out.print("Please enter the name: ");
				String name = in.next();
				System.out.print("Please enter the weight: ");
				double weight = in.nextDouble();
				System.out.print("Please enter the age: ");
				int age = in.nextInt();
				//make the Pet reference to a Dog object
				petArray[i] = new Dog(name, weight, age);
			}else {
				System.out.println("Invalid input, has to be \"cat\" of \"dog\"");
				System.exit(1);
			}
		}
		in.close();
		
		//display the information for each pet object
		//the sound() method is called polymorphically depending on the type
		for (int i = 0; i < petArray.length; i++) {
			petArray[i].displayAttributeInfo();
			petArray[i].sound();
		}
	}

}
