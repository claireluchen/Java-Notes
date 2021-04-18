package CTYLesson;

import java.util.Scanner;

public class DivideByZeroExceptionTest2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
				
		int a = in.nextInt();
		int b = in.nextInt();
		try {
			division(a, b);
		}
		catch (DivideByZeroException ex) {
			System.out.println("Entered catch in main");
			System.out.println(ex);
			try {
				//enter two more numbers
				System.out.println("please try again");
				int c = in.nextInt();
				int d = in.nextInt();
				division(c, d);
			}
			catch (DivideByZeroException ex2) {
				System.out.println(ex);
			}
		}
		
		
	}

	public static void division (int i, int j) throws DivideByZeroException {
		try {
			System.out.println("Entered try block in method"); 
			System.out.println("The value is " + i / j);
			System.out.println("Exit try block in method");
		}
		catch (ArithmeticException ex) {
			System.out.println(ex);
			throw new DivideByZeroException(0);
		}
	}
	/*
	2 0
	Entered try block in method
	java.lang.ArithmeticException: / by zero
	Entered catch in main
	CTYLesson.DivideByZeroException: divide by zero
	please try again
	3 0
	Entered try block in method
	java.lang.ArithmeticException: / by zero
	CTYLesson.DivideByZeroException: divide by zero
	 */
	
}
