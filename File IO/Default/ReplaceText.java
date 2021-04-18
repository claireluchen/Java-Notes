import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {

	public static void main(String[] args) throws Exception {
		//check command line parameter usage
		//command line argument is passed at runtime, e.g. java Hello helloWorld, helloWorld is the command
		if (args.length != 4) {
			System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
			System.exit(1);
		}
		
		//check if source file exists
		File sourceFile = new File(args[0]);
		if (!sourceFile.exists()) { //if the source file does not exist
			System.out.println("Source file " + args[0] + " does not exist");
			System.exit(2);
		}
		
		//check if target file exists
		File targetFile = new File(args[1]);
		if (!targetFile.exists()) { //if the target file does not exist
			System.out.println("Target file " + args[1] + " does not exist");
			System.exit(3);
		}
		
		//try-with-resource
		try(Scanner in = new Scanner(sourceFile); PrintWriter output = new PrintWriter(targetFile);){
			while(in.hasNext()) {
				String s1 = in.nextLine();
				String s2 = s1.replaceAll(args[2], args[3]);
				output.println(s2);
			}
		}
		
		
	}

}
