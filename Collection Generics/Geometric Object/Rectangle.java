package GeometricObject;
//subclass of GeometricObject superclass

public class Rectangle extends GeometricObject{
	//data field
	private double width;
	private double height;
	
	//constructor
	public Rectangle() {
	}
	
	//constructor that assigns value to rectanlge's own data field
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//constructor with properties of the superclass
	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	//return width
	public double getWidth() {
		return width;
	}
	
	//set a new width
	public void setWidth(double width) {
		this.width = width;
	}
	
	//return height
	public double getHeight() {
			return height;
	}
	
	//set a new height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//return area
	public double getArea() {
		return width * height;
	}
	
	//return perimeter
	public double getPerimeter() {
		return (width + height) * 2;
	}
	
}
