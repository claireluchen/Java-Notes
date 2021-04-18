import java.io.*;

/*
The method raf.length() returns the number of bytes in test.dat at any given time.
A random-access file consists of a sequence of bytes. A special marker called a file pointer is positioned at one of these bytes.
The file pointer is set at the beginning of the file when the file is opened. When reading from or writing data to the file, the file pointer moves forward to the next data item. Ex: read an int value using readInt(), the JVM reads 4 bytes from the file pointer and now the file pointer is 4 bytes ahead of the previous location.
raf.seek(position) moves the file pointer to a specified position. raf.seek(0) moves it to the beginning of the file and raf.seek(raf.length()) moves it to the end of the file.
 */
public class TestRandomAccessFile {

	public static void main(String[] args) throws IOException {
		//create a random access file
		try(RandomAccessFile inout = new RandomAccessFile("inout.dat", "rw");){
			//clear the file to destroy the old contents if exists
			inout.setLength(0);
			
			//write new integers to the file
			for (int i = 0; i < 200; i++) {
				inout.writeInt(i);
			}
			
			//display the current length of the file
			System.out.println("Current file length is " + inout.length());
			
			//retrieve the first number
			inout.seek(0);
			System.out.println("The first number is " + inout.readInt());
			
			//retrieve the second number, note each number takes 4 bytes
			//move the pointer after 4 bytes
			inout.seek(1 * 4);
			System.out.println("The second number is " + inout.readInt());

			//retrieve the 10th number
			inout.seek(9 * 4);
			System.out.println("The tenth number is " + inout.readInt());

			//modify the 11th element
			inout.writeInt(555);
			
			//Append a new number
			inout.seek(inout.length()); //move the pointer to the end
			inout.writeInt(999);
			
			//display the new length
			System.out.println("The length is " + inout.length());
			
			//retrieve the new eleventh number
			inout.seek(10 * 4);
			System.out.println("The eleventh number is " + inout.readInt());			
			
		}
		
		
	}

}
