import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment07Q11 extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox wordCountBox = new VBox(10);
        TextArea textArea = new TextArea(); //textarea
        Button countButton = new Button("Count Words"); //button
        Label countLabel = new Label("Word Count: 0"); //label

        countButton.setOnAction(e -> { //button func
            String text = textArea.getText().trim(); //used to remove whitespace
            int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length; //if text empty, wordcount = 0, else get length and split
            countLabel.setText("Word Count: " + wordCount);
        });

        wordCountBox.getChildren().addAll(textArea, countButton, countLabel);
        Scene wordCountScene = new Scene(wordCountBox, 350, 250);
        primaryStage.setTitle("Word Count Application");
        primaryStage.setScene(wordCountScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
