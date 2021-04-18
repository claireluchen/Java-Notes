package Unit8Class;
/**
 * This class models a Rectangle
 * Each rectangle has integer length and width, valid range 1-30.
 * Method includes drawing a rectangle on the standard output device, using a character specified by the user
 * It computes the area and perimeter of rectangles
 * @author Lu Chen
 */
public class Rectangle {
	//data field
	private int length;
	private int width;
	private char character;
	
	//default constructor
	public Rectangle() {
		length = 1;
		width = 1;
		character = '-';
	}
	
	//constructor with 3 parameters
	public Rectangle(int length, int width, char character) {
		//make sure that the input is valid
		if (length > 0 && length < 31 && width > 0 && width < 31) {
			this.length = length;
			this.width = width;
			this.character = character;
		}else if (length < 1 || length > 30) {
			System.out.println("Invalid length, has to be between 1 and 30, inclusive");
		}else if (width < 1 || width > 30) {
			System.out.println("Invalid width, has to be between 1 and 30, inclusive");
		}
	}
	
	//setter method for length
	public void setLength(int length) {
		if (length > 0 || length < 31) {
			this.length = length;
		}else {
			System.out.println("Invalid length, has to be between 1 and 30, inclusive");
		}
	}
	
	//getter method for length
	public int getLength() {
		return length;
	}
	
	//setter method for width
	public void setWidth(int width) {
		if (width > 0 || width < 31) {
			this.width = width;
		}else {
			System.out.println("Invalid width, has to be between 1 and 30, inclusive");
		}
	}
	
	//getter method for width
	public int getWidth() {
		return width;
	}
	
	//getter method for character
	public void setCharacter(char character) {
		this.character = character;
	}
	
	//setter method for character
	public char getCharacter() {
		return character;
	}
	
	//compute and returns the area of the rectangle
	public int getArea() {
		return length * width;
	}
	
	//compute and returns the perimeter of the rectangle
	public int getPerimeter() {
		return 2 * (length + width);
	}
	
	//display the rectangle with given character
	public void drawRectangle() {
		//display the upper line
		for (int i = 0; i < length; i++) {
			System.out.print(character);
		}
		
		//display the middle lines
		for (int i = 0; i < width - 2; i++) { //print width-2 lines
			System.out.print("\n" + character); //print the first character on the left
			for (int j = 0; j < length - 2; j++) {
				System.out.print(" "); //print spaces
			}
			System.out.print(character); //print the first character on the right
		}
		System.out.println();
		
		//display the bottom line
		for (int i = 0; i < length; i++) {
			System.out.print(character);
		}
		System.out.println();
	}
	
}
