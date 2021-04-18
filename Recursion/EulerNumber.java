package Recursion;

import java.util.Scanner;

/**
 * This program calculates the approximate value of e using recursion
 * e = 1 + 1 / 1! + 1 / 2! + ... + 1 / n!
 * The user specifies n, the program calculates Euler's number for n
 * @author Lu Chen
 *
 */
public class EulerNumber {
	/**
	 * This method calculates a number's factorial recursively
	 * @param number, int
	 * @return double, the factorial of  number
	 * precondition: an integer is passed into the method
	 * postcondition: n! will be returned as a double
	 */
	private static double factorial(int number) {
		if (number == 1 || number == 0) { //test for base case
			return 1; //base cases: 0! = 1 and 1! = 1
		}else { //recursion step
			return number * (factorial(number - 1));
		}		
	}
	
	/**
	 * This method calculates euler number for integer n
	 * The formula e = 1 + 1 / 1! + 1 / 2! + ... + 1 / n! is used
	 * @param n, int
	 * @return double, the resulting e
	 * precondition: an integer n is passed as the argument
	 * postcondition: the e will be calculated recursively and returned
	 */
	public static double eulerNumber(int n) {
		if (n == 0) { //if base case reached
			return factorial(n);
		}else{ //calculate 1 / n! + 1 / (n-1)! + 1 / (n-2)! + ... + 1 / 0!
			//each time one more new term will be added
			//first 1 / n! adds 1 / (n-1)!
			//then 1 / (n-1)! calls and adds 1 / (n-2)!
			return 1 / (factorial(n)) + (eulerNumber(n - 1));
		}
	}
	
	/**
	 * This method tests the eulerNumber method
	 * @param args
	 * precondition: the program needs to be compiled and running
	 * postcondition: the program prompts for user input and the according output is displayed onto the console
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter n, for which the Euler's number will be calculated: ");
		int n = in.nextInt();
		in.close();
		double result = eulerNumber(n);
		System.out.println("Euler number is " + result);
	}

}
