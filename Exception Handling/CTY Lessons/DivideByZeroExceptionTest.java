package CTYLesson;

import java.util.Scanner;

public class DivideByZeroExceptionTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		int j = in.nextInt();
		
		try {
			if (j == 0) {
				throw new DivideByZeroException(0);
			}else {
				System.out.println("The quotient is " + i/j);
			}
		}
		catch(DivideByZeroException ex) {
			System.out.println(ex); //CTYLesson.DivideByZeroException: divide by zero
			System.out.println("DivideByZeroException caught"); //DivideByZeroException caught
		}
		
	}

}
