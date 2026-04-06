import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;

public class Assignment07Q05 extends Application {
    private static final int GRID_SIZE = 4;
    private static final int BUTTON_SIZE = 50;
    private final Random random = new Random();
    
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10)); //set border to 10
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        
        for (int row = 0; row < GRID_SIZE; row++) { //2d array
            for (int col = 0; col < GRID_SIZE; col++) {
                Button button = new Button();
                button.setMinSize(BUTTON_SIZE, BUTTON_SIZE);
                button.setStyle("-fx-background-color: black;");
                
                button.setOnAction(e -> { //each button will have this function
                    String randomColor = getRandomColor();
                    button.setStyle("-fx-background-color: " + randomColor + ";");
                });
                
                gridPane.add(button, col, row); //adds buttons to gridpanes
            }
        }
        
        Scene scene = new Scene(gridPane, 300, 300);
        primaryStage.setTitle("Color Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private String getRandomColor() { //random color generator
        return String.format("rgb(%d,%d,%d)", random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
