package Unit8Class;
/**
 * This program tests the Time class by constructing six Time objects
 * It tests the toString, toUniversalString, setTime methods
 * @author lu
 *
 */
public class TestTime2 {

	public static void main(String[] args) {
		Time2 t1 = new Time2();
		Time2 t2 = new Time2(2);
		Time2 t3 = new Time2(21, 34);
		Time2 t4 = new Time2(12, 25, 42);
		Time2 t5 = new Time2(t4);
		
		displayTime("t1: default arguments", t1);
		displayTime("t2: hour sepcified", t2);
		displayTime("t3: hour and minute specified", t3);
		displayTime("t4: hour, minute, and second sepcified", t4);
		System.out.println("=======");
		displayTime("t5: constructed with Time object t4", t5);
		
		//set the second for t2
		t2.setSecond(25);
		displayTime("t2 second modified: ", t2);
		
		//set the minute for t3
		t3.setMinute(50);
		displayTime("t3 minute modified: ", t3);

		//set the hour for t4
		t4.setHour(3);
		displayTime("t4 hour modified: ", t4);
		
		//initialize t6 with invalid values
		Time2 t6 = new Time2();
		try {
			t6 = new Time2(34, 70, 99); //throw an exception			
		}catch(IllegalArgumentException e) {
			System.out.println("Exception while initializing t6 " + e.getMessage());
		}finally {
			t6.setHour(23);
			t6.setMinute(40);
			t6.setSecond(15);
			displayTime("t6 modified: ", t6);
		}
		
	}
	
	//displays the Time object to the screen
	private static void displayTime(String message, Time2 t) {
		System.out.printf("%s%n   %s%n   %s%n", message, t.toUniversalString(), t.toString());
	}

}
