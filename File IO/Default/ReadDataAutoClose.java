import java.util.Scanner;

public class ReadDataAutoClose {
	public static void main(String[] args) throws Exception {
		//create a File instance
		java.io.File file = new java.io.File("scores.txt");
		//create a Scanner for the file
		//this may throw an exception, so Exception is thrown in the header
		try (Scanner input = new Scanner(file);){
			//Read data from a file
			while(input.hasNext()) { //while this file has more data to read
				String firstName = input.next();
				String lastName = input.next();
				int score = input.nextInt();
				System.out.println(firstName + " " + lastName + " " + score);
				/*
				John Smith 90
				Eric Jones 85
				 */
			}
		}
	}
}
