import java.io.*;
/*
DataInputStream and DataOutputStream read and write java primitive-type values and strings in a machine-independent fashion
DataInputStream filters data from an input stream iinto appropriate primitive-type values or strings.
DataOutputStream converts primitive-type values or strings into bytes and outputs the bytes to an output stream
 */
public class TestDataStream {

	public static void main(String[] args) throws IOException{
		//create an output stream for file score.dat
		try (DataOutputStream output = new DataOutputStream(new FileOutputStream("score.dat"));){
			//write student test scores to the file
			output.writeUTF("John");
			output.writeDouble(87.6);
			output.writeUTF("Jim");
			output.writeDouble(97.6);
			output.writeUTF("George");
			output.writeDouble(100);
		}
		
		//read the data
		//create an input stream
		try(DataInputStream input = new DataInputStream(new FileInputStream("score.dat"));){
			//read data in the same order and format in which they are stored
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
			System.out.println(input.readUTF() + " " + input.readDouble());
		}
		
	}

}
