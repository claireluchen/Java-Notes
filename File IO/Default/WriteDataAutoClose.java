/*
try-with-resources syntax automatically closes the files
try(declare and create resources){
	use the resource to process the file;
}
 */
public class WriteDataAutoClose {
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
		
		//try-with-resource syntax to avoid forgetting to close()
		try (
		//Create a file
		//invoking the constructor of PrintWriter will create a new file if the file does not exist
		//if the file already exists, the current content in the file will be discarded without verifying the user
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		){
			//write formatted output to the file
			output.print("John Smith ");
			output.println(90);
			output.print("Eric Jones ");
			output.println(85);
		}
		
	}
}
