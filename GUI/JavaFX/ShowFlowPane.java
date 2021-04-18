package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application{
	@Override //override the start method in the Application class
	public void start(Stage primaryStage) {
		//create a pane and set its properties
		FlowPane pane = new FlowPane();
		//an Insets object specifies the size of the border of a pane
		//Insets(top, right, bottom, left)
		pane.setPadding(new Insets(11, 12, 13, 14)); 
		pane.setHgap(5); //set horizontal gap
		pane.setVgap(5); //set vertical gap
		
		//places nodes in the pane
		pane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("MI:"));
		TextField tfMi = new TextField();
		tfMi.setPrefColumnCount(1); //The preferred number of text columns
		pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("ShowFlowPane"); //set the stage title
		primaryStage.setScene(scene); //place the scene in the stage
		primaryStage.show(); //display the stage		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
