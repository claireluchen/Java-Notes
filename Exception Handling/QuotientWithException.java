import java.util.Scanner;

public class QuotientWithException {
	//quotient method
	public static int quotient(int num1, int num2) {
		if (num2 == 0) {
			//execution of a throw statement if called throwing an exception
			//exception is an object created from an exception class
			//here, the constructor ArithmeticException(str) is invoked to construct an exception object
			//where str is a message that describes the exception
			throw new ArithmeticException("Divisor cannot be zero");
		}else {
			return num1 / num2;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter two numbers ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
	
		try {
			//try block
			//invoke method
			int result = quotient(num1, num2);
			System.out.println(num1 + " / " + num2 + " is " + result);
		}catch (ArithmeticException ex) {
			//if an ArithmeticException occurs in the try block, catch block is executed
			//catch block
			System.out.println(ex); //java.lang.ArithmeticException: Divisor cannot be zero
			System.out.println("Exception: an integer cannot be divided by zero");
		}
		
		System.out.println("Execution ends");
	}
	
}
