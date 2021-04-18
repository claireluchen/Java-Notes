
public class TestFileClass {

	public static void main(String[] args) {
		java.io.File file = new java.io.File("image/us.gif");
		//exists()
		System.out.println("Does it exist? " + file.exists());
		//length()
		System.out.println("The file has " + file.length() + " bytes");
		//canRead()
		System.out.println("Can it be read? " + file.canRead());
		//canWrite()
		System.out.println("Can it be written? " + file.canWrite());
		//isDirectory()
		System.out.println("Is it a directory? " + file.isDirectory());
		//isFile()
		System.out.println("Is it a file ? " + file.isFile());
		//isAbsolute()
		System.out.println("Is it absolute? " + file.isAbsolute());
		//isHidden()
		System.out.println("Is it hidden? " + file.isHidden());
		//getAbsolutePath()
		System.out.println("Absolute path is " + file.getAbsolutePath());
		//lastModified()
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));
		
		/*
		Does it exist? false
		The file has 0 bytes
		Can it be read? false
		Can it be written? false
		Is it a directory? false
		Is it a file ? false
		Is it absolute? false
		Is it hidden? false
		Absolute path is C:\\Users\\lu\\eclipse-workspace\\FileInputOutput\\image\\us.gif
		Last modified on Wed Dec 31 19:00:00 EST 1969
		 */
		
	}

}
