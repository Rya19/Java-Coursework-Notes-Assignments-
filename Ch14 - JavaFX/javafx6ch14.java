import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class javafx6ch14 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    FlowPane pane = new FlowPane(); 
    pane.setPadding(new Insets(11, 12, 13, 14)); //top right bottom left | sets the gaps in that order <- | 
    pane.setHgap(5); // Set hGap to 5px | the gap between 2 nodes in the pane
    pane.setVgap(5);

    // Place nodes in the pane
    pane.getChildren().addAll(new Label("First Name:"), new TextField(), new Label("MI:")); //create a label with text fields
    TextField tfMi = new TextField(); //create a textfield object
    tfMi.setPrefColumnCount(1); // you can set the max number of characters in a textfield
    pane.getChildren().addAll(tfMi, new Label("Last Name:"), new TextField());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 200, 250);
    primaryStage.setTitle("ShowFlowPane"); // Set the stage title
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