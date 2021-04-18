package EventAnimation;
//place nodes inside a pane then place the pane into a scene then place the scene onto a stage
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application{
	@Override //override the start method in the Application class
	public void start(Stage primaryStage) {
		//create a scene and place a button in the scene
		StackPane pane = new StackPane(); //create a pane
		pane.getChildren().add(new Button("OK")); //add a button
		//the above two sentences can be replaced by
		//StackPane pane = new StackPane(new Button("OK"));
		Scene scene = new Scene(pane, 200, 50);
		primaryStage.setTitle("Button in a pane");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}	
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
