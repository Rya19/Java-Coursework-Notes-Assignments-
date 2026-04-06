import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Assignment07Q03 extends Application {
    private static final int SIZE_INCREMENT = 10;
    private static final int MIN_SIZE = 20;
    private static final int MAX_SIZE = 200;
    private int squareSize = 50; // Initial size
    
    @Override
    public void start(Stage primaryStage) {
        Rectangle square = new Rectangle(squareSize, squareSize, Color.BLUE); //make buttons and rectangle here
        Button increaseButton = new Button("Increase");
        Button decreaseButton = new Button("Decrease");
        
        // Button actions
        increaseButton.setOnAction(e -> { //make button that wont exceed sizes
            if (squareSize + SIZE_INCREMENT <= MAX_SIZE) {
                squareSize += SIZE_INCREMENT;
                square.setWidth(squareSize);
                square.setHeight(squareSize);
            }
        });
        
        decreaseButton.setOnAction(e -> {
            if (squareSize - SIZE_INCREMENT >= MIN_SIZE) {
                squareSize -= SIZE_INCREMENT;
                square.setWidth(squareSize);
                square.setHeight(squareSize);
            }
        });
        
        // Hbox layout
        HBox root = new HBox(10, square, increaseButton, decreaseButton); //create hbox object
        root.setStyle("-fx-padding: 20px; -fx-alignment: center;");
        
        Scene scene = new Scene(root, 400, 200); //scene create
        primaryStage.setTitle("Resize Square");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
