import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

class javafx5ch14 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane to hold the image views
    Pane pane = new HBox(10); //create a container
    pane.setPadding(new Insets(5, 5, 5, 5)); //setpadding takes an object of type insets, which ten takes 4 args, the distance between the borders, dist from the top, bottom, left and right
    Image image = new Image("image/us.gif"); //create a new image
    pane.getChildren().add(new ImageView(image)); //add image to the pane
    
    ImageView imageView2 = new ImageView(image); //create a new imageview object and pass the image you created above
    imageView2.setFitHeight(100); //sets the height and width into a specified size
    imageView2.setFitWidth(100);
    pane.getChildren().add(imageView2);    //add imageview object into pane

    ImageView imageView3 = new ImageView(image);
    imageView3.setRotate(90);
    pane.getChildren().add(imageView3);     
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowImage"); // Set the stage title
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