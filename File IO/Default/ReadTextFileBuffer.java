import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileBuffer {

	public static void main(String[] args) {
		BufferedReader in = null;
		String line = null;
		
		try {
			in = new BufferedReader(new FileReader("Scores.txt"));
			while ((line = in.readLine()) != null) { //same as while (in.hasNext()) in Scanner
				System.out.println(line);
			}
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		
		
	}

}
