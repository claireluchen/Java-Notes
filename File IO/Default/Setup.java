import java.io.*;

/*
First, a FileWriter object is created to connect the disk file ‘mydata.txt’ with the output stream.
Then, a PrintWriter object is created to write to the stream by passing the FileWriter object to the PrintWriter constructor.
This is called stream layering, or stream wrapping.
In this example the output will be unbuffered. In practice, we’ll normally want to buffer the write operations.
The next example shows how to include buffering. This expression could have been written on one line, but sometimes structuring it across several lines makes it easier to read.
In this example, a FileWriter object was created and passed to a BufferedWriter constructor, and a BufferedWriter object was passed to the PrintWriter constructor.
 */
public class Setup {

	public static void main(String[] args) throws IOException {
		//the output will be unbuffered
		//a FileWriter object is created to connect the disk file ‘mydata.txt’ with the output stream
		FileWriter f = new FileWriter("mydata.txt");
		//a PrintWriter object is created to write to the stream by passing the FileWriter object to the PrintWriter constructor
		//This is called stream layering, or stream wrapping.
		PrintWriter output = new PrintWriter(f);
		
		//the output will be buffered
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("mydata.txt")));
		
		
	}

}
