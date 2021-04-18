
import java.util.Scanner;

/**
 * This program prompts the user to enter two number, x and y
 * It calculates x / y. It rounds and displays the result in integer, 1 decimal, 2 decimal, 3 decimal places
 * @author Lu Chen
 */
public class Rounding {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number, x: ");
		double x = in.nextDouble();
		System.out.print("Please enter a second number, y: ");
		double y = in.nextDouble();
		in.close();
		int integer = (int) (Math.floor(((double) x / y) * Math.pow(10, 0) + 0.5) / Math.pow(10, 0));
		double oneDecimal = Math.floor(((double) x / y) * Math.pow(10, 1) + 0.5) / Math.pow(10, 1);
		double twoDecimal = Math.floor(((double) x / y) * Math.pow(10, 2) + 0.5) / Math.pow(10, 2);
		double threeDecimal = Math.floor((((double) x / y) * Math.pow(10, 3) + 0.5)) / Math.pow(10, 3);
		System.out.printf("The result of x / y in integer is: %d%n", integer);
		System.out.printf("The result of x / y to one decimal place is: %.1f%n", oneDecimal);
		System.out.printf("The result of x / y to two decimal place is: %.2f%n", twoDecimal);
		System.out.printf("The result of x / y to three decimal place is: %.3f%n", threeDecimal);
	}

}
