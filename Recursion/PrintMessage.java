package Recursion;
/*
It breaks the problem into two sub-problems: one is to display the message one time and the other is to display it N-1 times. 
The second problem is the same as the original problem but smaller in size.
The printMessage() method is a recursive method. It will accept a parameter containing the message to be displayed, and a parameter specifying the number of times to display the message.
If the message is to be displayed at least once, printMessage() displays it and then calls itself again, this time specifying the message should be displayed N-1 times.
The second time the method is called it will display the message, then call itself N-2 times, and so forth.
If the message is to be displayed zero times, printMessage() will not call itself again, but will simply stop. The stopping condition is called a base case.
 */
public class PrintMessage {
	
	public static void printMessage(String message, int numOfTimes) {
		if (numOfTimes == 0) { //test the base case
			return;
		}else {
			System.out.println(numOfTimes + ": " + message); //print the message
			printMessage2(message, numOfTimes - 1); //call itself again
		}
	}
	
	//same as printMessage. the base case return isn't written since it will automatically return when the if() condition becomes false
	public static void printMessage2(String message, int numOfTimes) {
		if (numOfTimes >= 1) { 
			System.out.println(numOfTimes + ": " + message); //print the message
			printMessage2(message, numOfTimes - 1); //call itself again
		}
	}
	
	public static void main(String[] args) {
		printMessage("message", 10);

	}

}
