import java.io.*;

public class WriteTextFile {

	public static void main(String[] args) {
		int x = 10, y = 20, z = 30;
		PrintWriter output = null;
		try {
			output = new PrintWriter(new BufferedWriter(new FileWriter("mydata.txt", true)));
			output.println("x = " + x);
			output.println("y = " + y);
			output.println("z = " + z);
			//The first argument in the printf() method is a format control string. It specifies that 3 integer arguments will be printed¡­each in a field 10 characters wide and right justified
			output.printf("%10d %10d %10d", x, y, z); //	10	20	30
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		finally {
			output.close();
		}
		//use "type FileName.txt" to display the content on the cmd
		//use "dir DirectoryName" to display whether the directory exists on cmd
		
		
	}

}
