package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{ //extends Application
	@Override //override the start method in the Application class
	public void start(Stage primaryStage) {
		//create a scene and place a button in the scene
		Button btOK = new Button("OK"); //create a button
		Scene scene = new Scene(btOK, 200, 250); //create a scene
		primaryStage.setTitle("MyJavaFX"); //set the stage title
		primaryStage.setScene(scene); //place the scene in the stage
		primaryStage.show(); //display the stage
	}

	//the main method is only needed for IDE with limited JavaFX support. Not needed for running from the command line
//	public static void main(String[] args) {
//		Application.launch(args); //launch application
//		
//	}

}
