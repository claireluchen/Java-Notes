import java.io.*;

/*
FileInputStream input = new FileInputStream("temp.dat");
input.read() returns -1 when the end of file has been reached
 */
public class EndOfFile {

	public static void main(String[] args) {
		File file = new File("endFile.dat");
		if (file.exists()) {
			file.delete();
		}
		try {
			//output stream
			try(DataOutputStream output = new DataOutputStream(new FileOutputStream(file))){
				output.writeDouble(4.5);
				output.writeDouble(40.5);
				output.writeDouble(400.5);
			}
			
			if (file.exists()) {
				//input stream
				try(DataInputStream input = new DataInputStream(new FileInputStream("endFile.dat"))){
					while(true) { //if there's no more to read, an exception will be thrown
						System.out.println(input.readDouble());
					}
				}
			}
			
		}
		catch(EOFException ex) {
			System.out.println("All data were read");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
	}

}
