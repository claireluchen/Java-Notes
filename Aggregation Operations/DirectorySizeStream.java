import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class DirectorySizeStream {

	public static void main(String[] args) {
		//find the size of the directory
		System.out.println("Enter a directory or a file");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		
		//display the size
		System.out.println(getSize(new File(name)) + " bytes");
		in.close();
	}
	
	//method to get size of the file/directory
	public static long getSize(File file) {
		if(file.exists()) {
			return file.length();
		}else {
			try {
				//Files.list(file.toPath()) returns a stream consisting of the Path objects
				//each Path object represents a subpath in the directory.
				//for each subpath e, the mapToLong method maps e into the size of e by invoking getSize(e)
				return Files.list(file.toPath()).parallel().mapToLong(e -> getSize(e.toFile())).sum();
			} catch(Exception ex) {
				System.out.println(ex);
				return 0;
			}
		}
	}
	
}
