package EventAnimation;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application{
	@Override //override the start method in the application class
	public void start(Stage primaryStage) {
		//create a pane and set its properties
		Pane pane = new BorderPane();
		Text text = new Text(20, 20, "Programing is fun");
		pane.getChildren().addAll(text);
		//allow the text to be dragged, or allow the text to move to the place on the text where the mouse clicks
		text.setOnMouseDragged(e -> {text.setX(e.getX()); text.setY(e.getY());});
		text.setOnMouseClicked(e -> {text.setX(e.getX()); text.setY(e.getY());});
		
		//have the four buttons: up, down, left, right
		//Hold four buttons in an HBox
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		((BorderPane) pane).setBottom(hBox);
		//set the buttons to action
		btUp.setOnAction(e -> text.setY(text.getY() > 15 ? text.getY() - 5 : 10));
		btDown.setOnAction(e -> text.setY(text.getY() < pane.getHeight() - 5 ? text.getY() + 5 : pane.getHeight()));
		btLeft.setOnAction(e -> text.setX(text.getX() > 5 ? text.getX() - 5 : 0));
		btRight.setOnAction(e -> text.setX(text.getX() < pane.getWidth() - 105 ? text.getX() + 5 : pane.getWidth() - 100));
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane, 300, 100);
		primaryStage.setTitle("Mouse Event");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
		
	public static void main(String[] args) {
		Application.launch(args);
	}

}
