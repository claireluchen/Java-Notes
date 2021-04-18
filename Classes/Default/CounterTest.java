package Unit9Class;
/**
 * This method tests the Counter class and CounterConsoleMenu class
 * @author Lu Chen
 *
 */
public class CounterTest {

	public static void main(String[] args) {		
		//create a console object
		CounterConsoleMenu console = new CounterConsoleMenu(new Counter());
		
		for (;;) {
			//display options to the user
			console.displayMenu();
			
			//get user choice and modify the counter accordingly
			console.modifyCounter(console.getNumInput());
		}	
		
	}

}
