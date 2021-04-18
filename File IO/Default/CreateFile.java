import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		//create a directory
		Files.createDirectories(Paths.get("Create"));
		
		//create a file
		File file = new File("MyFile.txt");
		System.out.println(file.getAbsolutePath()); //C:\Users\lu\eclipse-workspace\FileInputOutput\MyFile.txt
		System.out.println(file.getName()); //MyFile.txt
		
		//if the file already exists, it is deleted so it can be replaced
		if (file.exists()) {
			file.delete();
		}
		
		//if the file doesn't exist, print out the following contents
		if (!file.exists()) {
			try(PrintWriter output = new PrintWriter(file);){
				output.println("Hello");
				output.println("Still in quarantine");
				output.println("April 21, 2020");
			}
		}
		
		//Scanner the content in the text file
		if (file.exists()) {
			try(Scanner in = new Scanner(file);){
				//print out the text in the exact same format
				while(in.hasNext()) {
					String line = in.nextLine();
					String[] array = line.split(" ");
					for (int i = 0; i < array.length; i++) {
						if (i == array.length - 1) {
							System.out.println(array[i]);
						}else {
							System.out.print(array[i] + " ");
						}
					}				
				}
			}
		}
		
	}

}
