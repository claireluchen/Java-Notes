import java.io.*;

//use binary I/O to write 10 byte values from 1 to 10 to a file named temp.dat
//read them back from the file

public class BasicOutputStream {

	public static void main(String[] args) throws IOException {
		//create an output stream to the file
		try(FileOutputStream output = new FileOutputStream("temp.dat")){
			//output values to the file
			for (int i = 1; i <= 10; i++) {
				output.write(i);
			}
		}
		
		//create an input stream for the file, read in data
		try(FileInputStream input = new FileInputStream("temp.dat")){
			//read values from the file
			int value;
			//while there's more data
			//input.read() returns -1 when the end of the stream is reached
			while((value = input.read()) != -1) {
				System.out.print(value + " ");
			}
		}
		
	}

}
