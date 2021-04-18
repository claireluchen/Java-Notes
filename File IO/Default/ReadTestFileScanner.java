import java.io.*;
import java.util.Scanner;

public class ReadTestFileScanner {

	public static void main(String[] args) {
		BufferedReader in = null;
		Scanner scan = null;
		
		try {
			in = new BufferedReader(new FileReader("Scores.txt"));
			scan = new Scanner(in);
			while(scan.hasNext()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			in.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}

}
