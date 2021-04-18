import java.io.*;

public class TestObjectOutputStream {

	public static void main(String[] args) throws IOException{
		//create an output stream for file object.dat
		try(ObjectOutputStream output = new ObjectOutputStream(new BufferedOutputStream (new FileOutputStream("object.dat")));){
			//Write a string, double value, and object to the file
			output.writeUTF("John"); //output string
			output.writeDouble(85.5); //output double
			output.writeObject(new java.util.Date()); //output object
		}
		
	}

}
