package CTYLesson;

public class CatchException1 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			System.out.println("Enter try block"); //Enter try block
			System.out.println("The value is " + i/j);
			System.out.println("Exiting try block");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex); //java.lang.ArithmeticException: / by zero
			System.out.println("The dividend can't be zero, arithmetic exception caught"); //The dividend can't be zero, arithmetic exception caught
		}
		System.out.println("Method ends"); //Method ends
		
	}

}
