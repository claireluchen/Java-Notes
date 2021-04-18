import java.io.*;

public class TestArrayStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		int[] numbers = {1, 2, 3, 4, 5};
		String[] strings = {"John", "Susan", "Kim"};
		File file = new File("array.dat");
		if (file.exists()) {
			file.delete();
		}
		
		//create an output stream for file array.dat
		try(ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file, true)));){
			//write arrays to the object output stream
			out.writeObject(numbers);
			out.writeObject(strings);
			//modify the numbers array
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = i + 2;
			}
			out.writeObject(numbers); //rewrite the numbers array 			
		}
		
		//create an input stream for file array.dat
		try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));){
			//readObject() returns a Object type, needs to be casted
			int[] newNumbers = (int[]) (in.readObject()); 
			String[] newString= (String[]) (in.readObject());
			for (int i = 0; i < newNumbers.length; i++) {
				System.out.print(newNumbers[i] + " "); //1 2 3 4 5, the new content is not written
			}
			System.out.println();
			for (int i = 0; i < newString.length; i++) {
				System.out.print(newString[i] + " ");
			}
		}
		
	}

}
