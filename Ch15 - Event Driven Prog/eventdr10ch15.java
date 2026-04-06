import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class eventdr10ch15 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Place an ellipse to the pane
    Pane pane = new Pane();
    Ellipse ellipse = new Ellipse(10, 10, 100, 50);


    ellipse.setFill(Color.RED); 
    ellipse.setStroke(Color.BLACK);

    //This is for window sizing, if you extend or shrink the window, the ellipse will extend as well
    ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
    ellipse.centerYProperty().bind(pane.heightProperty().divide(2));    
    ellipse.radiusXProperty().bind(pane.widthProperty().multiply(0.4));    
    ellipse.radiusYProperty().bind(pane.heightProperty().multiply(0.4)); 

    pane.getChildren().add(ellipse);
    

    // Apply a fade transition to ellipse
    FadeTransition ft =  new FadeTransition(Duration.millis(3000), ellipse); //make a fade object with a duration of 3 secs, and takes the shape object
    ft.setFromValue(1.0); //set opacity from 1 to 0.01
    ft.setToValue(0.01);
    ft.setCycleCount(Timeline.INDEFINITE);
    ft.setAutoReverse(true);
    ft.play(); // Start animation 
    
    // Control animation with mouse clicks
    ellipse.setOnMousePressed(e -> ft.pause());
    ellipse.setOnMouseReleased(e -> ft.play());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 150);
    primaryStage.setTitle("FadeTransitionDemo"); // Set the stage title
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