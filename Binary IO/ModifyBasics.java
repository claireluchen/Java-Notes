package Lesson;

import java.io.*;

public class ModifyBasics {

	public static void main(String[] args) {
		File f = new File("test.dat");
		RandomAccessFile in = null;
		double d = 39.9;
		
		try {
			in = new RandomAccessFile(f, "rw");
			in.seek(4); //set pointer to double
			System.out.println(in.readDouble()); //read the double that's already stored in the file
			in.seek(4); //reset the pointer
			in.writeDouble(d); //write a new double
			in.seek(4); //reset the pointer
			System.out.println(in.readDouble()); //read the newly written double
			in.close();
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		
		
	}

}
