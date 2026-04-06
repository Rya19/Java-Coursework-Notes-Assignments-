import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

class javafx7ch14 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    GridPane pane = new GridPane(); //create a new gridpane object
    pane.setAlignment(Pos.CENTER); // Set center alignment | sets node into the center
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5)); //widths of the border around the nodes
    pane.setHgap(5.5); //gab between the nodes
    pane.setVgap(5.5); // Set vGap to 5.5px
    
    // Place nodes in the pane
    pane.add(new Label("First Name:"), 0, 0); //adds a label at the column index
    pane.add(new TextField(), 1, 0); //adds textfield input at col 1, index 0, right next to the label

    pane.add(new Label("MI:"), 0, 1); 
    pane.add(new TextField(), 1, 1);

    pane.add(new Label("Last Name:"), 0, 2);
    pane.add(new TextField(), 1, 2);

    Button btAdd = new Button("Add Name");
    pane.add(btAdd, 1, 3);
    GridPane.setHalignment(btAdd, HPos.RIGHT); //default will be set to the middle

    //Grid size is 2 (col) x 4 (row), with (0, 3) being unused
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowGridPane"); // Set the stage title
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