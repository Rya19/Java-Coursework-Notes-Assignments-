import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment07Q02 extends Application {
    private int count = 0; // Counter variable
    
    @Override
    public void start(Stage primaryStage) {
        Label countLabel = new Label("Count: " + count); //label with text
        Button incrementButton = new Button("Increment"); //buttons
        Button decrementButton = new Button("Decrement");
        
        // Event handlers for buttons
        incrementButton.setOnAction(e -> {
            count++; //inc count
            countLabel.setText("Count: " + count); //changes text everytime buttons clicked
        });
        
        decrementButton.setOnAction(e -> {
            count--; //dec count
            countLabel.setText("Count: " + count);
        });
        
        // VBox layout
        VBox root = new VBox(10, countLabel, incrementButton, decrementButton); //make vbox and add button and label here
        root.setStyle("-fx-padding: 20px; -fx-alignment: center;");
        
        Scene scene = new Scene(root, 200, 150);
        primaryStage.setTitle("Counter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
