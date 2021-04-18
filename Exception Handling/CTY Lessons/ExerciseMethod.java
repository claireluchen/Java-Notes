package CTYLesson;

public class ExerciseMethod {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
			System.out.println("Entered try block in main"); //Entered try block in main
			division (i, j);
			System.out.println("Exit try block in main");
		}
		catch(ArithmeticException ex) {
			//modify the default message of ArithmeticException
			ex = new ArithmeticException("can't divide by zero");
			System.out.println(ex); //java.lang.ArithmeticException: can't divide by zero
			System.out.println("ArithmeticException caught"); //ArithmeticException caught
		}
		finally {
			System.out.println("finally block"); //finally block
		}
		
	}
	
	//method that prints out the result of i / j, which generates an exception
	public static void division (int i, int j) {
		try {
			System.out.println("Entered try block in method"); //Entered try block in method
			System.out.println("The value is " + i / j);
			System.out.println("Exit try block in method");
		}
		catch (NullPointerException ex) {
			
		}
	}

}
