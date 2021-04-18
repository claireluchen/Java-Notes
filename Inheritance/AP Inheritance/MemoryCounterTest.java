package Unit10Inheritance;
/**
 * This method creates a MemoryCounterConsoleMenu object and tests its functionality
 * @author Lu Chen
 *
 */

public class MemoryCounterTest {

	public static void main(String[] args) {
		//create a MemoryConsole object
		MemoryCounterConsoleMenu console = new MemoryCounterConsoleMenu(new MemoryCounter());
				
		for (;;) {
			//display options to the user
			console.displayMenu();
			
			//get user choice and modify the counter accordingly
			console.modifyMemoryCounter(console.getNumInput());
		}	
	}

}
