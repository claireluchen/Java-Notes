import java.io.File;
/*
To write data to a file
- First create a file
java.io.File file = new java.io.File("xx.txt");
- Second, check whether the file already exists
file.exists();
- Use PrintWriter to write data into the file, invoke the constructor of the PrintWriter
java.io.PrintWriter output = new java.io.PrintWriter(file);
- Write data using PrintWriter
output.print("First name");
output.println("Last name");
 */
public class WriteDataBook {
	//Invoking the constructor of PrintWriter may throw an I/O exception
	//Java forces you to write the code to deal with this type of exception
	public static void main(String[] args) throws java.io.IOException{
		//create a file
		java.io.File file = new java.io.File("Scores.txt");

		//check whether the file scores.txt exists
		if (file.exists()) {
			System.out.println(file.getAbsolutePath());
			System.out.println("File already exists");
			System.exit(1);
		}
		
		//invoking the constructor of PrintWriter will create a new file if the file does not exist
		//if the file already exists, the current content in the file will be discarded without verifying the user
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		//write formatted output to the file
		output.print("John Smith ");
		output.println(90);
		output.print("Eric Jones ");
		output.println(85);
		
		//close the file, otherwise data may not be saved properly
		output.close();
		
	}

}
