package JavaFX;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application{
	@Override
	public void start(Stage primaryStage) {
		//create a pane and set its properties
		GridPane pane = new GridPane(); //create a grid pane
		pane.setAlignment(Pos.CENTER); //set the position to middle
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		//place nodes in the pane
		//note that the coordinates work like x-y grid
		pane.add(new Label("First Name"), 0, 0); //add label
		pane.add(new TextField(), 1, 0); //add text field
		pane.add(new Label("MI:"), 0, 1);
		pane.add(new TextField(), 1, 1);
		pane.add(new Label("Last Name:"), 0, 2);
		pane.add(new TextField(), 1, 2);
		Button btAdd = new Button("Add Name");
		pane.add(btAdd, 1, 3); //add button
		GridPane.setHalignment(btAdd, HPos.RIGHT); //align button right
		
		pane.getChildren().remove(0, 3); //remove from position 0 to 2, excluding 2
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowGridPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
