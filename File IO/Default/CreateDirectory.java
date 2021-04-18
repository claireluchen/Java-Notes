import java.io.*;
import java.util.Scanner;

public class CreateDirectory {

	public static void main(String[] args) {
		String dirName = "MyDirectory";
		String fName = dirName + "/" + "ASCII.txt";
		File dir = new File( dirName );
		File f = new File( fName );
		
		//create a directory
		if ( dir.mkdir() == true ){
			try{
				f.createNewFile();
			}
			catch ( Exception e ){
				System.out.println( "FILE NOT CREATED" );
			}
			finally{
				System.out.println("\nAbsolute Path Name is " + f.getAbsolutePath() );
			}
		}else {
			dir.delete();
			System.out.println( "New Directory created" );
			try{
				f.createNewFile();
			}
			catch ( Exception e ){
				System.out.println( "FILE NOT CREATED" );
			}
			finally{
				System.out.println("\nAbsolute Path Name is " + f.getAbsolutePath() );
			}
		}
		
		//print first 101 ASCII value to the file
		try {
			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(f)));
			for (int i = 0; i < 100; i++) {
				output.println(i + " " + ((char)i));
			}
			output.close();
		} catch (IOException ex) {
			System.out.println(ex);
		}
		
		//print out the content of the file to this console
		try (Scanner in = new Scanner(f);){
			while(in.hasNext()) {
				System.out.println(in.nextLine());
			}
			
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		}
		
		
	}

}
