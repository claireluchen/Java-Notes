package EventAnimation;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KeyEventDemo extends Application{
	@Override
	public void start(Stage primaryStage) {
		//create a pane and set its properties
		Pane pane = new Pane();
		Text text = new Text(20, 20, "A");
		
		pane.getChildren().add(text);
		text.setOnKeyPressed(e -> {
			switch(e.getCode()) { //returns the key code associated with the key, key code constants include HOME, END, CONTROL, etc.
			case DOWN: text.setY(text.getY() < pane.getHeight() - 10 ? text.getY() + 10 : pane.getHeight()); break;
			case UP: text.setY(text.getY() > 10 ? text.getY() - 10 : 0); break;
			case LEFT: text.setX(text.getX() > 10 ? text.getX() - 10 : 0); break;
			case RIGHT: text.setX(text.getX() < pane.getWidth() - 10 ? text.getX() + 10 : pane.getWidth()); break;
			default: if (e.getText().length() > 0) {text.setText(e.getText());}
			}			
		});
		
		//create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Key Event");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		text.requestFocus(); //enables text to receive key input
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
