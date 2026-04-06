import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class eventdr7ch15 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    Pane pane = new Pane();
    Text text = new Text(20, 20, "Programming is fun"); //create a pane and place the text on those X Y java cordinate.

    pane.getChildren().addAll(text); //retusn array list and add the text to the pane

    text.setOnMouseDragged(e -> {     //able to drag the text anywhere   
      text.setX(e.getX()); //returns x and y cord at the current spot. I use the text to move it to wherever the mouse is pointing at
      text.setY(e.getY());
    });
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 300, 100);
    primaryStage.setTitle("MouseEventDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 