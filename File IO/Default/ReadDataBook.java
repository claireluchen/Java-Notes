import java.util.Scanner;
/*
To read data from a file
- First create a File instance
java.io.File file = new java.io.File("xxx.txt");
- Second use a Scanner to read data from this file
Scanner in = new Scanner(file);
- Read data while the file has more data to read
in.hasNext();
- Use in.next(), in.nextInt(), in.nextByte(), etc. to read the file
String name = in.next();
int score = in.nextInt();
 */
public class ReadDataBook{

	public static void main(String[] args) throws Exception {
		//create a File instance
		java.io.File file = new java.io.File("scores.txt");
		//create a Scanner for the file
		//this may throw an exception, so Exception is thrown in the header
		Scanner input = new Scanner(file);
		
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
		
		//close the file
		input.close();
		
	}

}
