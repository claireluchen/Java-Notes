package EventAnimation;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransitionDemo extends Application{
	@Override
	public void start(Stage primaryStage) {
		//create a pane
		Pane pane = new Pane();
		
		//create a rectangle
		Rectangle rectangle = new Rectangle(0, 0, 25, 50);
		rectangle.setFill(Color.ORANGE);
		
		//create a circle
		Circle circle = new Circle(125, 100, 50);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		
		//add circle and rectangle to the pane
		pane.getChildren().add(circle);
		pane.getChildren().add(rectangle);
		
		//create a path transition
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.millis(4000));
		//set circle as the path, rectangle as the node
		pt.setPath(circle);
		pt.setNode(rectangle);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(true);
		pt.play();
		
		circle.setOnMousePressed(e -> pt.pause());
		circle.setOnMouseReleased(e -> pt.play());
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("Path Transition");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
