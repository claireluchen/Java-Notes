import java.util.Scanner;

public class QuotientWithMethod {
	//method for finding quotient
	public static int quotient(int num1, int num2) {
		if (num2 == 0) {
			//shouldn't let the method terminate the program
			//the caller should decide whether to terminate the program
			System.out.println("The divisor can't be 0");
			System.exit(1);
		}
		return num1 / num2;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		System.out.println("The quotient of " + num1 + " / " + num2 + " is " + quotient(num1, num2));
		
	}
	
}
