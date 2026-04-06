import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class MyJavaFX extends Application { // Need to extend apps
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a button and place it in the scene
    Button btOK = new Button("OK"); //create a button
    Scene scene = new Scene(btOK, 200, 250); //create a scene that takes button(s), width and height
    primaryStage.setTitle("MyJavaFX"); // Set the stage title 
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) { 
    launch(args); //need main method
  }
} //When ran, a popup window that will show an application with the OK button shown on the entire window. 