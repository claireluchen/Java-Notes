package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application{
	@Override
	public void start(Stage primaryStage) {
		//create a border pane
		BorderPane pane = new BorderPane();
		pane.setTop(getHBox()); //add an HBox to top
		pane.setLeft(getVBox()); //add a VBox to left
		
		//create a scene and place it on the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowHBoxVBox");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//get HBox
	private HBox getHBox(){
		HBox hBox = new HBox(15);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		hBox.setStyle("-fx-background-color: gold");
		hBox.getChildren().add(new Button("Computer Science"));
		hBox.getChildren().add(new Button("Chemistry"));
		return hBox;
	}
		
	//get VBox
	private VBox getVBox() {
		VBox vBox = new VBox(15);
		vBox.setPadding(new Insets(15, 5, 5, 5));
		vBox.getChildren().add(new Label("Courses"));
		Button[] courses = {new Button("CS1"), new Button("CS2"), new Button("CS3"), new Button("CS4")};
		for (Button b : courses) {
			VBox.setMargin(b, new Insets(0, 0, 0, 15)); //set the margin
			vBox.getChildren().add(b);
		}
		return vBox;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
