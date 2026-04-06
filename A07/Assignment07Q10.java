import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment07Q10 extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox calculatorBox = new VBox(10);
        TextField num1Field = new TextField();
        TextField num2Field = new TextField();
        Button addButton = new Button("Add"); //buttons and text fields
        Label resultLabel = new Label("Result: ");

        addButton.setOnAction(e -> { //addbutton function
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                resultLabel.setText("Result: " + (num1 + num2));
            } 
            
            catch (NumberFormatException ex) { //exception handler
                resultLabel.setText("Invalid input");
            }
        });

        calculatorBox.getChildren().addAll(num1Field, num2Field, addButton, resultLabel);
        Scene calculatorScene = new Scene(calculatorBox, 300, 200);
        primaryStage.setTitle("Basic Calculator");
        primaryStage.setScene(calculatorScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}