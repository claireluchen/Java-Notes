package Unit10Inheritance;

public class EnhancedRectangle extends Rectangle
{
  public double getArea()
  {
    return this.getLength() * this.getWidth();
  }
  
  public double getPerimeter()
  {
    return 2 * ( this.getLength() + this.getWidth() );
  }
}