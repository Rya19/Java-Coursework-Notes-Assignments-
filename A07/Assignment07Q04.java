import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Assignment07Q04 extends Application {
    private static final String[] IMAGE_PATHS = { //images in array
        "image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", "image5.jpg"
    };
    private int currentIndex = 0;
    private ImageView imageView;
    
    @Override
    public void start(Stage primaryStage) {
        imageView = new ImageView(new Image(IMAGE_PATHS[currentIndex])); //imageview object
        imageView.setFitWidth(400);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);
        
        Button prevButton = new Button("Previous"); //buttons
        Button nextButton = new Button("Next");
        
        prevButton.setOnAction(e -> showPreviousImage()); //go to next and previous images
        nextButton.setOnAction(e -> showNextImage());
        
        BorderPane root = new BorderPane();
        root.setCenter(imageView);
        
        BorderPane bottomPane = new BorderPane();
        bottomPane.setLeft(prevButton);
        bottomPane.setRight(nextButton);
        root.setBottom(bottomPane);
        
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setTitle("Image Viewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    

    //functions
    private void showPreviousImage() {
        currentIndex = (currentIndex - 1 + IMAGE_PATHS.length) % IMAGE_PATHS.length;
        imageView.setImage(new Image(IMAGE_PATHS[currentIndex]));
    }
    
    private void showNextImage() {
        currentIndex = (currentIndex + 1) % IMAGE_PATHS.length;
        imageView.setImage(new Image(IMAGE_PATHS[currentIndex]));
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
