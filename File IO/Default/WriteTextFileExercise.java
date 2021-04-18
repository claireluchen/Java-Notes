import java.io.*;
import java.util.*;
/*
create a text file for storing information about tasks: 
a task number, a task description, and a task due date. 
The task due date is represented by a Date object. 
Each set of task data shall be written on a single line
the task number shall be right-justified in a field with of 5, 
the task description shall be left-justified in a field width of 30, 
the due date shall be written as a string right-justified in a field width of 15.
 */
public class WriteTextFileExercise {

	public static void main(String[] args) {
		PrintWriter output = null;
		Date [] dueDates = { new Date( 3, 10, 2011 ),
							new Date( 2, 20, 2011 ),
							new Date( 3, 30, 2011 ) };
		String [] tasks = { "Do Java Homework",
							"Get concert tickets",
							"Study for math test" };
		try {
			output = new PrintWriter(new BufferedWriter(new FileWriter("task.txt")));
			for (int i = 0; i < dueDates.length; i++) {
				//%d is a digit, %s is a string
				//- (hyphen) means left-justified
				output.printf("%5d %-30s %15s", (i+1), tasks[i], dueDates[i].getDate());
				System.out.println();
			}
			
		}
		catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			output.close();
		}
		
		
	}

}
