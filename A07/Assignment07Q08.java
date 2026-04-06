import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Assignment07Q08 extends Application {
    private boolean drawCircle = true; //simplicity
    
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        
        Button circleButton = new Button("Circle");
        circleButton.setLayoutX(50);
        circleButton.setLayoutY(10);
        
        Button rectangleButton = new Button("Rectangle");
        rectangleButton.setLayoutX(120);
        rectangleButton.setLayoutY(10);
        
        pane.setOnMouseClicked(event -> {
            if (drawCircle) {
                Circle circle = new Circle(event.getX(), event.getY(), 20, Color.BLUE); //create circle
                pane.getChildren().add(circle);
            } else {
                Rectangle rectangle = new Rectangle(event.getX() - 20, event.getY() - 20, 40, 40); //create rectangle
                rectangle.setFill(Color.RED);
                pane.getChildren().add(rectangle);
            }
        });
        
        circleButton.setOnAction(e -> drawCircle = true); //switches between the two
        rectangleButton.setOnAction(e -> drawCircle = false);
        
        pane.getChildren().addAll(circleButton, rectangleButton);
        
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Shape Drawer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}