package EventAnimation;
/*
The listener class must implement the functional interface InvalidationListener to override the invalidated(Observable o) method for handling the value change.
Once the value is changed in the Observable object, the listener is notified by invoking its invalidated(Observable o) method
 */
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservablePropertyDemo {

	public static void main(String[] args) {
		DoubleProperty balance = new SimpleDoubleProperty();
		//adding a listener
		balance.addListener(new InvalidationListener() { //implements InvalidationListener
			//override the invalidated(Observable o) method
			public void invalidated(Observable ov) {
				System.out.println("The new value is " + balance.doubleValue());
			}
		});
		/*
		can simply the anonymous inner class to
		balance.addListener(ov -> {
			System.out.println("The new value is " + balance.doubleValue());
		});
		 */
		
		balance.set(4.5);
	}

}
