import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		System.out.println("Enter case number ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		try {
			if (num > 3 || num <= 0) {
				throw new RuntimeException("invalid input, enter number less than 3");
			}
		}
		catch (RuntimeException ex) {
			System.out.println(ex); //java.lang.RuntimeException: invalid input, enter number less than 3
			System.out.println("RuntimeException caught"); //RuntimeException caught
		}
		
		try {
			switch(num) {
			case 1:
				int[] array = new int[10];
				for (int i = 0; i <= array.length; i++) {
					array[i] = i;
				}
				break;
			case 2: 
				System.out.println("Input two numbers to be divided");
				double num1 = in.nextDouble();
				double num2 = in.nextDouble();
				if (num2 == 0) {
					throw new ArithmeticException ("dividend can't be zero");
				}else {
					System.out.println(num1 + " / " + num2 + " is " + num1 / num2);
				}
			case 3:
				System.out.println("Input an integer");
				int integer = in.nextInt();
				System.out.println("The input integer is " + integer);
				break;
			}	
		}
		//if one of the catch phrase is omitted, the exception is not caught
		//finally will execute, and the program terminates ("Execution ends" is not displayed");
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException caught");
		}
		catch (ArithmeticException ex) {
			System.out.println("ArithmeticException caught");
		}
		catch (InputMismatchException ex) {
			System.out.println(ex); //dividend can't be zero
			System.out.println("InputMismatchException caught"); 
		}
		
		finally {
			System.out.println("finally clause executed");
		}
		System.out.println("Execution ends");
		
		
	}
}
