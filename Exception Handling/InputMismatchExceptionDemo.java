import java.util.*;

public class InputMismatchExceptionDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.print("Enter an integer: ");
				int number = in.nextInt();
				
				//display the result if input is an integer
				System.out.println("The number entered is " + number);
				continueInput = false;
			}
			catch (InputMismatchException ex){
				//if an error is thrown by JVM because the input isn't an integer
				System.out.println("Try again (Incorrect input: an integer is required)");
				in.nextLine(); //discard input						
			}
		}while (continueInput);	
		
		
	}

}
