import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lab_06 extends Application {
    @Override
    public void start(Stage primaryStage) {
        // UI Components
        TextField tempInput = new TextField();
        tempInput.setPromptText("Enter Temperature");
        
        Button cToFButton = new Button("Convert to Fahrenheit");
        Button fToCButton = new Button("Convert to Celsius");
        
        Label resultLabel = new Label();
        Label adviceLabel = new Label();
        
        // Event Handlers
        cToFButton.setOnAction(e -> {
            try {
                double celsius = Double.parseDouble(tempInput.getText());
                double fahrenheit = (9.0 / 5.0 * celsius) + 32;
                resultLabel.setText(String.format("%.2f °F", fahrenheit));
                
                if (celsius < 10) adviceLabel.setText("Too Cool");
                else if (celsius > 30) adviceLabel.setText("Too Hot");
                else adviceLabel.setText("Nice Temperature");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid Input");
                adviceLabel.setText("");
            }
        });
        
        fToCButton.setOnAction(e -> {
            try {
                double fahrenheit = Double.parseDouble(tempInput.getText());
                double celsius = (5.0 / 9.0) * (fahrenheit - 32);
                resultLabel.setText(String.format("%.2f °C", celsius));
                
                if (fahrenheit < 50) adviceLabel.setText("Too Cool");
                else if (fahrenheit > 86) adviceLabel.setText("Too Hot");
                else adviceLabel.setText("Nice Temperature");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid Input");
                adviceLabel.setText("");
            }
        });
        
        // Layout
        VBox root = new VBox(10, tempInput, cToFButton, fToCButton, resultLabel, adviceLabel);
        root.setPadding(new Insets(15));
        
        // Scene and Stage Setup
        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.setTitle("Temperature Converter");
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
