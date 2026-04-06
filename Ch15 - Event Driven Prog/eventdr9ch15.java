import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class eventdr9ch15 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane 
    Pane pane = new Pane();
    
    // Create a rectangle
    Rectangle rectangle = new Rectangle(0, 0, 25, 50); //create a rectangle
    rectangle.setFill(Color.ORANGE);
    
    // Create a circle
    Circle circle = new Circle(125, 100, 50); //create a circle
    circle.setFill(Color.WHITE);
    circle.setStroke(Color.BLACK);
    
    // Add circle and rectangle to the pane
    pane.getChildren().add(circle);
    pane.getChildren().add(rectangle);
    
    // Create a path transition 
    PathTransition pt = new PathTransition(); //create a new path object
    pt.setDuration(Duration.millis(4000)); //time in milliseconds (4 seconds)
    pt.setPath(circle); //the path is the circle object
    pt.setNode(rectangle); //the node that will go on the path is the rectangle

    pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);

    pt.setCycleCount(Timeline.INDEFINITE); //go on foreveer

    pt.setAutoReverse(true); //when it completes its rotation, go the other way again
    pt.play(); // Start animation 
    
    circle.setOnMousePressed(e -> pt.pause()); //mouse determines when the circle stops or continues
    circle.setOnMouseReleased(e -> pt.play());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 200);
    primaryStage.setTitle("PathTransitionDemo"); // Set the stage title
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