import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		try(Scanner in3 = new Scanner(System.in); Scanner in = new Scanner("13 14"); Scanner in2 = new Scanner("34 567");){
		
			int sum = in.nextInt() + in.nextInt();
			System.out.println("Sum is " + sum); //Sum is 27
						
			int intValue = in2.nextInt();
			String line = in2.nextLine();
			System.out.println(intValue); //34
			System.out.println(line); // 567
			
			//if you read it from the keyboard
			//input 34 "Enter" 567
			/*
			If the nextLine() method is invoked after a token-based input method, 
			this method reads characters that start from this delimiter and end with the line separator. 
			The line separator is read, but it¡¯s not part of the string returned by nextLine().
			 */
		
			int intValue2 = in3.nextInt();
			String line2 = in3.nextLine();
			System.out.println(intValue2); //34
			System.out.println(line2); //nothing, program terminated
		}
	}

}
