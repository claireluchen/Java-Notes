import java.io.IOException;
import java.util.Scanner;

public class ReadFileFromURL {

	public static void main(String[] args) {
		System.out.print(" Enter a URL: ");
		//enter a URL
		String URLString = new Scanner(System.in).next();
		
		try {
			//create a URL object
			java.net.URL url = new java.net.URL(URLString);
			int count = 0;
			//create a scanner object
			Scanner in = new Scanner(url.openStream());
			while(in.hasNext()) { //is there more to read?
				String line = in.nextLine();
				count += line.length();
			}
			System.out.println("The file size is " + count + " characters");
		}
		catch(java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} 
		catch (IOException ex2) {
			System.out.println("I/O Errors: no such file");
		}
		
	}

}
