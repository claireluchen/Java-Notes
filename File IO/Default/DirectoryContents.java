import java.io.File;

public class DirectoryContents {

	public static void main(String[] args) {
		//create a file object
		//forward slashes can be used, will be converted to backslashes automatically by java
		File dir = new File("E:/");
		//returns list of files an directories in a string array
		String[] array = dir.list();
		System.out.println("Files in " + dir.getAbsolutePath() + " are ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
