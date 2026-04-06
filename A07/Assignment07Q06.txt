import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Assignment07Q06 extends Application {
    //priv
    private int seconds = 0;
    private Timeline timeline;
    private Label timeLabel;

    //pub
    @Override
    public void start(Stage primaryStage) {
        timeLabel = new Label("Seconds: 0");
        Button startButton = new Button("Start");
        Button stopButton = new Button("Stop");

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> { //keyframe says that every 1 second, do this code
            seconds++;
            timeLabel.setText("Seconds: " + seconds);
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);

        startButton.setOnAction(e -> timeline.play());
        stopButton.setOnAction(e -> timeline.stop());

        VBox root = new VBox(10, timeLabel, startButton, stopButton);
        root.setStyle("-fx-padding: 10; -fx-alignment: center;");

        primaryStage.setScene(new Scene(root, 250, 150));
        primaryStage.setTitle("Simple Timer");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
