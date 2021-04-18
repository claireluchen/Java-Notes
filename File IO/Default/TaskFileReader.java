import java.io.*;
/*
Write a program called TaskFileReaderExercise.java that reads the task information in the tasks.txt file 
that was created in the last exercise and displays the information on the standard output as follows:
Task # ¡­num..
Task: ¡­task description¡­
Date: mm/dd/yyyy
 */

public class TaskFileReader{
	public static void main( String [] args ){
			String line = null;
			BufferedReader in = null;
			try{
				in = new BufferedReader(new FileReader( "task.txt" ) );
				while( ( line = in.readLine() ) != null ){
					String s = line.substring( 0, 5 );
					int taskNum = Integer.parseInt( s.trim() );
					String task = line.substring( 5, 35 );
					String date = line.substring( 35, 50 );
					System.out.println( "Task # " + taskNum );
					System.out.println( "Task: " + task.trim() );
					System.out.println( "Date: " + date.trim() );
				}
				in.close();
			}
			catch ( Exception e ){
				System.out.println(e);
			}
	}
}
