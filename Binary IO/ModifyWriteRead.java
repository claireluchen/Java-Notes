package Lesson;

import java.io.*;

public class ModifyWriteRead {

	public static void main(String[] args) {
		File file = new File("products.dat");
		try(RandomAccessFile f = new RandomAccessFile(file, "rw");){
			System.out.println(file.length());
			f.seek(file.length());
			f.writeInt(100); //4 bytes
			f.writeChars("ABCDE"); //2 * 5 = 10 bytes
			f.writeInt(100); //4 bytes
			f.writeDouble(10.3); //8 bytes
			System.out.println(file.length());
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		
		
	}

}
