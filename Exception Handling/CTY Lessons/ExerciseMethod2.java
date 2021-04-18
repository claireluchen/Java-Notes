package CTYLesson;

public class ExerciseMethod2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try {
			System.out.println("Entered try block in main"); //Entered try block in main
			division (i, j);
			System.out.println("Exit try block in main");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex); //java.lang.ArithmeticException: can't divide by zero
			System.out.println("ArithmeticException caught"); //ArithmeticException caught
		}
		
	}
	
	//method that prints out the result of i / j, which generates an exception
	public static void division (int i, int j) {
		try {
			if (j == 0) {
				System.out.println("Entered try block in method"); //Entered try block in method
				//create an ArithmeticException object, modifiy the default message
				throw new ArithmeticException("can't divide by zero");
			}else {
				System.out.println("Entered try block in method"); 
				System.out.println("The value is " + i / j);
				System.out.println("Exit try block in method");
			}
		}
		catch (NullPointerException ex) {
			
		}
	}
}
