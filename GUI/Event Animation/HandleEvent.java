package EventAnimation;
/*
To be a handler of an action event, two requirements must be met
The object must be an instance of the EventHandler<T extends Event> interface, which defines the common behavior for all handlers. <T extends Event> denotes that T is a generic type that is a subtype of Event.
The EventHandler object handler must be registered with the event source object using the method source.setOnAction(handler)
The EventHandler<ActionEvent> interface contains the handle(ActionEvent) method for processing the action event.
 */
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application{
	@Override
	public void start(Stage primaryStage) {
		//create a pane and set its properties
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button btOK = new Button("OK");
		Button btCancel = new Button("Cancel");
		//create a OKHandlerClass object
		OKHandlerClass handler1 = new OKHandlerClass();
		btOK.setOnAction(handler1); //register handler
		//create a CancelHandlerClass object
		CancelHandlerClass handler2 = new CancelHandlerClass();
		btCancel.setOnAction(handler2); //register handler
		pane.getChildren().addAll(btOK, btCancel); //place the buttons onto the pane
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Handle Event");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}

//OKHandler class
class OKHandlerClass implements EventHandler<ActionEvent>{
	@Override
	public void handle(ActionEvent e) { //handle(ActionEvent) method for processing the action event
		System.out.println("OK Button Clicked");
	}
}

//CancelHandler class
class CancelHandlerClass implements EventHandler<ActionEvent>{
	@Override
	public void handle(ActionEvent e) {
		System.out.println("Cancel Button Clicked");
	}
}

