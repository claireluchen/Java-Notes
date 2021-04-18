package EventAnimation;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.FadeTransition;

public class FadeTransitionDemo extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		//place an ellipse to the pane
		Pane pane = new Pane();
		Ellipse ellipse = new Ellipse(10, 10, 100, 50);
		ellipse.setFill(Color.RED);
		ellipse.setStroke(Color.BLACK);
		ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
		ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
		ellipse.radiusXProperty().bind(pane.widthProperty().multiply(0.4));
		ellipse.radiusYProperty().bind(pane.heightProperty().multiply(0.4));
		pane.getChildren().add(ellipse);
		
		//apply a fade transition to ellipse
		FadeTransition ft = new FadeTransition(Duration.millis(3000), ellipse);
		ft.setFromValue(1.0);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		//control animation
		ellipse.setOnMousePressed(e -> ft.pause());
		ellipse.setOnMouseReleased(e -> ft.play());
		
		//create a scene and place it in the stage
		Scene scene = new Scene (pane, 200, 150);
		primaryStage.setTitle("Fade Transition");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
