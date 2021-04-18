package EventAnimation;
//when the user resizes the window, the pane's width and height is changed
//the listeners are called to invoke the resize() method to change the size of the circle and rectangle
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ResizableCircleRectangle extends Application{
	//create a circle and a rectangle
	private Circle circle = new Circle(60);
	private Rectangle rectangle = new Rectangle(120, 120);
	
	//place clock and label in border pane
	private StackPane pane = new StackPane();
	
	@Override //override the start method in the Application class
	public void start(Stage primaryStage) {
		circle.setFill(Color.DARKGRAY);
		rectangle.setFill(Color.WHITE);
		rectangle.setStroke(Color.BLACK);
		pane.getChildren().addAll(rectangle, circle);
		
		//create a scene and place the pane in the stage
		Scene scene = new Scene(pane, 140, 140);
		primaryStage.setTitle("Resizable Circle Rectangle");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		pane.widthProperty().addListener(ov -> resize());
		pane.widthProperty().addListener(ov -> resize());
	}
	
	private void resize() {
		double length = Math.min(pane.getWidth(), pane.getHeight());
		circle.setRadius(length / 2 - 15);
		rectangle.setWidth(length - 30);
		rectangle.setHeight(length - 30);
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
