;
public class CircleWithExceptionTest{

	public static void main(String[] args) {
		try {
			CircleWithException c1 = new CircleWithException(5);
			//java.lang.IllegalArgumentException: Radius cannot be negative
			CircleWithException c2 = new CircleWithException(-5); 
			CircleWithException c3 = new CircleWithException(0);
		}
		catch(IllegalArgumentException ex){
			//ex and ex.toString() give the same result
			System.out.println(ex); //java.lang.IllegalArgumentException: Radius cannot be negative
		}
		
		//Number of objects created: 1
		//since the radius is negative, an exception is thrown
		//the code in the catch block is executed, c3 is skipped, so c1 is the only object created
		System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
		
		
	}

}
