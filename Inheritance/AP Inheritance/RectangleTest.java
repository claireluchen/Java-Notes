package Unit10Inheritance;

public class RectangleTest
{
  public static void main( String [] args )
  {
    EnhancedRectangle anEnhancedRectangle = new EnhancedRectangle();
    
    // Set attributes
    anEnhancedRectangle.setSides( 40, 30 );
    
    // Display attributes and area
    System.out.println( "Enhanced rectangle length is " + anEnhancedRectangle.getLength() );
    System.out.println( "Enhanced rectangle width is " + anEnhancedRectangle.getWidth() );
    System.out.println( "Enhanced rectangle perimeter is " + anEnhancedRectangle.getPerimeter() );
    System.out.println( "Enhanced rectangle area is " + anEnhancedRectangle.getArea() );
  }
}
