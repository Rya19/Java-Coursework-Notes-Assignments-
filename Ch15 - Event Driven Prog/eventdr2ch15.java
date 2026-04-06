import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class eventdr2ch15 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) { //override method start
    // Create a pane and set its properties
    HBox pane = new HBox(10); //create pane to display 2 buttons next to eachother horizontally
    pane.setAlignment(Pos.CENTER); //align in the center

    Button btOK = new Button("OK"); //create 2 new buttons
    Button btCancel = new Button("Cancel");

    //These 4 linesa re related to handling the events
    OKHandlerClass handler1 = new OKHandlerClass(); //in order to create an event, we need to make our own event class
    btOK.setOnAction(handler1); //method to register handler to button(source)

    CancelHandlerClass handler2 = new CancelHandlerClass();
    btCancel.setOnAction(handler2);
    //End of handling events

    pane.getChildren().addAll(btOK, btCancel); //took both buttons and added to the pane
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("HandleEvent"); // Set the stage title
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


//Classes for handlers
class OKHandlerClass implements EventHandler<ActionEvent> { //2 buttons, so 2 event class, each handling their own events
  @Override //have to override the only abstract method handle
  public void handle(ActionEvent e) { //once the user click, an object of type action event will be fired, and will be received in this method
    System.out.println("OK button clicked"); 
  }
}

class CancelHandlerClass implements EventHandler<ActionEvent> {
  @Override
  public void handle(ActionEvent e) {
    System.out.println("Cancel button clicked");
  }
}