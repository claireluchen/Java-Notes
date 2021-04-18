package JavaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application{
	@Override //override the start method in the Application class
	public void start(Stage primaryStage) {
		//create a circle and set its properties
		Circle circle = new Circle();
		//the x-coordinate increases from left to right
		circle.setCenterX(100); 
		//the y-coordinate increases downward
		circle.setCenterY(100);
		circle.setRadius(50);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.BLACK);
		
		//create a pane to hold the circle
		Pane pane = new Pane(); //create a pane
		pane.getChildren().add(circle); //add circle to pane
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("ShowCircle"); //set the stage title
		primaryStage.setScene(scene); //place the scene in the stage
		primaryStage.show(); //display the stage		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
