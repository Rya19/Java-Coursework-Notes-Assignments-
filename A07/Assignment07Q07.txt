import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Assignment07Q07 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane(); //create pane
        
        Circle circle = new Circle(20, Color.BLUE); //blue circle size
        circle.setCenterX(50);
        circle.setCenterY(100);
        
        Button startButton = new Button("Start Animation"); //button
        startButton.setLayoutX(50);
        startButton.setLayoutY(200);
        
        TranslateTransition transition = new TranslateTransition(Duration.seconds(2), circle); //every 2 seconds, do the following code for the circle object
        transition.setFromX(50);
        transition.setToX(300);
        transition.setCycleCount(TranslateTransition.INDEFINITE);
        transition.setAutoReverse(true);
        
        startButton.setOnAction(e -> transition.play()); //button has function
        
        pane.getChildren().addAll(circle, startButton); //adds items to pane
        
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Circle Animation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}