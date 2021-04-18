import java.io.*;

public class TestObjectInputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		File file = new File("object.dat");
		if (!file.exists()) {
			System.out.println("no file found");
			System.exit(1);
		}
		
		//create object input stream for file object object.dat
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));){
			//read a string
			String name = in.readUTF();
			//read a double
			double score = in.readDouble();
			//read a date
			java.util.Date date = (java.util.Date) (in.readObject());
			System.out.println(name + " " + score + " " + date);
		}
		
		
	}

}
