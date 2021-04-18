package EventAnimation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application{
	private CirclePane circlePane = new CirclePane(); //create a CirclePane object
	
	@Override
	public void start(Stage primaryStage) {
		//hold two buttons in a HBox
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setAlignment(Pos.CENTER);
		Button btEnlarge = new Button("Enlarge");
		Button btShrink = new Button("Shrink");
		//add the buttons onto the hHox
		hBox.getChildren().add(btEnlarge); 
		hBox.getChildren().add(btShrink);
		
		//create and register the handler
		btEnlarge.setOnAction(new EnlargeHandler());
		btShrink.setOnAction(new ShrinkHandler());
		
		//create a border pane
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(circlePane);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		//create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 200, 150);
		primaryStage.setTitle("Control Circle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	//inner handler class for enlarging
	class EnlargeHandler implements EventHandler<ActionEvent>{
		@Override //override the handle method
		public void handle(ActionEvent e) {
			circlePane.enlarge();
		}
	}
	
	//inner handler class for shrinking
	class ShrinkHandler implements EventHandler<ActionEvent>{
		@Override
		public void handle(ActionEvent e) {
			circlePane.shrink();
		}
	}
}

//CirclePane class
class CirclePane extends StackPane{
	private Circle circle = new Circle(50); //construct a circle with r = 50
	
	public CirclePane() {
		getChildren().add(circle);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
	}
	
	public void enlarge() { //enlarge the circle
		circle.setRadius(circle.getRadius() + 2);
	}
	
	public void shrink() { //shrink the circle
		circle.setRadius(circle.getRadius() > 2 ? circle.getRadius() - 2 : circle.getRadius());
	}
}
