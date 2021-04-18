package Lesson;

import java.io.*;

public class BasicsInOutputStream {

	public static void main(String[] args) {
		int x = 10;
		double y = 10.00;
		char c = 'A';
		//this file will be overridden if it already exits
		//File("test.dat", true) will have new data appended to it
		File f = new File ("test.dat");
				
		//write data to the file
		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));){
			out.writeInt(x);
			out.writeDouble(y);
			out.writeChar(c);
			System.out.println("The size is " + out.size()); //get the size
			out.close();
		}
		catch(IOException ex){
			System.out.println(ex);
		}
		
		//read data from the file
		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));){
			int a = in.readInt();
			double b = in.readDouble();
			char ch = in.readChar();
			System.out.println(a); //10
			System.out.println(b); //10.0
			System.out.println(ch); //A
			in.close();
		}
		catch(IOException ex){
			System.out.println(ex);
		}
		
		
	}

}
