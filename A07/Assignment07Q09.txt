import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Assignment07Q09 extends Application {
    private int currentLight = 0;
    private final Circle redLight = new Circle(50, Color.GRAY); //stoplight objects
    private final Circle yellowLight = new Circle(50, Color.GRAY);
    private final Circle greenLight = new Circle(50, Color.GRAY);

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10);
        vbox.setStyle("-fx-alignment: center;");

        Button nextButton = new Button("Next"); //button
        nextButton.setOnAction(e -> changeLight()); //button func

        vbox.getChildren().addAll(redLight, yellowLight, greenLight, nextButton);
        updateLights();

        Scene scene = new Scene(vbox, 200, 400);
        primaryStage.setTitle("Traffic Light Simulation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void changeLight() { //switches between lights
        currentLight = (currentLight + 1) % 3;
        updateLights();
    }

    private void updateLights() {
        redLight.setFill(currentLight == 0 ? Color.RED : Color.GRAY); //function to switch between the lights with a simple if statement
        yellowLight.setFill(currentLight == 1 ? Color.YELLOW : Color.GRAY);
        greenLight.setFill(currentLight == 2 ? Color.GREEN : Color.GRAY);
    }

    public static void main(String[] args) {
        launch(args);
    }
}