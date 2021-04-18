package Recursion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * This program calculates the approximate value of e using recursion
 * e = 1 + 1 / 1! + 1 / 2! + ... + 1 / n!
 * The user specifies n, the program calculates Euler's number for n
 * @author Lu Chen
 *
 */
public class EulerNumber3 {
	/**
	 * This method calculates a number's factorial recursively
	 * @param number, int
	 * @return double, the factorial of  number
	 * precondition: an integer is passed into the method
	 * postcondition: n! will be returned as a double
	 */
	private static BigDecimal factorial(BigDecimal number) {
		if (number.equals(BigDecimal.ONE) || number.equals(BigDecimal.ZERO)) { //test for base case
			return BigDecimal.ONE; //base cases: 0! = 1 and 1! = 1
		}else { //recursion step
			return number.multiply((factorial(number.subtract(BigDecimal.ONE))));
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
	public static BigDecimal eulerNumber(BigDecimal n) {
		if (n.equals(BigDecimal.ZERO)) { //if base case reached
			return factorial(n);
		}else{ //calculate 1 / n! + 1 / (n-1)! + 1 / (n-2)! + ... + 1 / 0!
			//each time one more new term will be added
			//first 1 / n! adds 1 / (n-1)!
			//then 1 / (n-1)! calls and adds 1 / (n-2)!
			return BigDecimal.ONE.divide(factorial(n), 20, RoundingMode.HALF_EVEN).add(eulerNumber(n.subtract(BigDecimal.ONE)));
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
		String n = in.next();
		in.close();
		BigDecimal result = eulerNumber(new BigDecimal(n));
		System.out.println("Euler number is " + result);
	}

}
