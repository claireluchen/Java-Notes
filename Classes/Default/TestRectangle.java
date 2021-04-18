package Unit8Class;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//prompt the user for input
		System.out.print("Please enter the length of the rectangle: ");
		int length = in.nextInt();
		System.out.print("Please enter the width of the rectangle: ");
		int width = in.nextInt();
		System.out.print("Please enter the character used to draw the rectangle: ");
		char character = in.next().charAt(0);
		
		//create a rectangle object based on user input
		//uses the overloaded constructor
		Rectangle r1 = new Rectangle(length, width, character);

		displayInfo(r1); //display the rectangle, calling the class method
		
		//Prompt user to modify the existing data
		System.out.print("Please enter a new length: ");
		int newLength = in.nextInt();
		r1.setLength(newLength); //set a new length
		System.out.print("Please enter a new width: ");
		int newWidth = in.nextInt();
		r1.setWidth(newWidth); //set a new width
		System.out.print("Please enter a new character: ");
		char newCharacter = in.next().charAt(0);
		r1.setCharacter(newCharacter); //set a new character
		
		displayInfo(r1); //display the rectangle
		
		in.close();
	}

	//method used to display rectangle information
	//uses getArea(), getPerimeter(), drawRectangle() methods from the Rectangle class
	public static void displayInfo(Rectangle r1) {
		System.out.println("The area of the rectangle is: " + r1.getArea());
		System.out.println("The perimeter of the rectangle is: " + r1.getPerimeter());
		System.out.println("The rectangle looks like: ");
		r1.drawRectangle(); //print out the rectangle
	}
	
}
