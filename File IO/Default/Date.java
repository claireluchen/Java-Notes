import java.util.Scanner;

public class Date
{
  private int month;
  private int day;
  private int year;
  
  public Date() { month = 0; day = 0; year = 0; }
  public Date( int m, int d, int y )
  {
    month = editMonth( m );
    day = editDay( d );
    year = editYear( y );
  }
  public void setDate( int m, int d, int y )
  {
    month = editMonth( m );
    day = editDay( d );
    year = editYear( y );
  }
  public String getDate( )
  {
    return month + "/" + day + "/" + year;
  }
  public int getMonth() { return month; }
  public int getDay() { return day; }
  public int getYear() { return year; }
  
  protected int editMonth( int m )
  {
    if( m >= 1 && m <= 12 )
      return m;
    else
    {
      Scanner input = new Scanner( System.in );
      while( !( m >= 1 && m <= 12 ) )
      {
        System.out.print( "Month must be 1-12 --- Please re-enter: " );
        m = input.nextInt();
      }
      return m;
    }          
  }
  
  protected int editDay( int d )
  {
    int [] monthDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    if( d >= 1 && d <= monthDays[month - 1] )
      return d;
    else
    {
      Scanner input = new Scanner( System.in );
      while( !( d >= 1 && d <= monthDays[month - 1] ) )
      {
        System.out.print( "Day must be 1 - " + monthDays[month - 1] + " --- please re-enter: " );
        d = input.nextInt();
      }
      return d;
    }
  }
  
  protected int editYear( int y )
  {
    if( y >= 1 )
      return y;
    else
    {
      Scanner input = new Scanner(System.in);
      while( y < 1 )
      {
        System.out.print( "Year must be greater than 1 --- please re-enter: " );
        y = input.nextInt();
      }
      return y;
    }
  }
}