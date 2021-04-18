package EventAnimation;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ControlCircleWithMouseKey extends Application{
	private CirclePane circlePane = new CirclePane();
	
	@Override
	public void start(Stage primaryStage) {
		//hold two buttons in an HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		hBox.getChildren().add(btEnlarge);
		hBox.getChildren().add(btShrink);
		
		//create and register the handler
		btEnlarge.setOnAction(e -> circlePane.enlarge());
		btShrink.setOnAction(e -> circlePane.shrink());
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		//create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("Control Circle With Mouse and Key");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//mouse click handler
		circlePane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) { //left click
				circlePane.enlarge();
			}else if (e.getButton() == MouseButton.SECONDARY){ //right click
				circlePane.shrink();
			}
		});
		
		//key-pressed handler
		scene.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.UP) { //up arrow pressed
				circlePane.enlarge();
			}else if (e.getCode() == KeyCode.DOWN) { //down arrow pressed
				circlePane.shrink();
			}
		});
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
