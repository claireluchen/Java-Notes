package EventAnimation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application{
	@Override
	public void start(Stage primaryStage) {
		Text text = new Text(40, 40, "Programming is fun");
		Pane pane = new Pane(text);
		
		//Hold four buttons in an HBox
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		HBox hBox = new HBox(btUp, btDown, btLeft, btRight);
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		
		//place the hBox at the bottom of the border pane
		BorderPane borderPane = new BorderPane(pane); 
		borderPane.setBottom(hBox);
		
		//create and register the handler
		//Up button
		btUp.setOnAction(new EventHandler<ActionEvent>() { //anonymous inner class
			@Override //override the handle method
			public void handle(ActionEvent e) {
				text.setY(text.getY() > 15 ? text.getY() - 5 : 10);
			}
		});
		
		//Down button
		btDown.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				text.setY(text.getY() < pane.getHeight() - 5 ? text.getY() + 5 : pane.getHeight());
			}
		});
		
		//Left button
		btLeft.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				text.setX(text.getX() > 5 ? text.getX() - 5 : 0);
			}
		});
		
		//Right button
		btRight.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				text.setX(text.getX() < pane.getWidth() - 105 ? text.getX() + 5 : pane.getWidth()-100);
			}
		});
		
		//create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 400, 350);
		primaryStage.setTitle("Anonymous Handler Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
