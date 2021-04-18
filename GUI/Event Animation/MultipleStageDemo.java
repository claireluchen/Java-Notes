package EventAnimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application{
	@Override //override the start method in the Application class
	public void start(Stage primaryStage) { //primaryStage in start
		//create a scene and place a button in the scene
		Scene scene = new Scene(new Button("Old Stage"), 200, 250);
		primaryStage.setTitle("First Stage"); //set the stage title
		primaryStage.setScene(scene); //set the scene in the stage
		primaryStage.show(); //display the stage
		
		Stage stage = new Stage(); //create a new stage
		stage.setTitle("Second Stage");
		stage.setScene(new Scene(new Button("New Stage"), 200, 250));
		stage.show(); //display the second stage
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
