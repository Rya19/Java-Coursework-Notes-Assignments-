import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.HashSet;

public class Assignment08Q04 extends Application {

    // HashSet to store unique names
    private final HashSet<String> nameSet = new HashSet<>();

    // UI components
    private TextField nameInputField;
    private TextArea displayArea;


    @Override
    public void start(Stage primaryStage) {
        // Input field to type names
        nameInputField = new TextField();
        nameInputField.setPromptText("Enter a name");


        // Button to add name
        Button addButton = new Button("Add Name");
        // Button to show unique names
        Button showButton = new Button("Show Names");


        // TextArea to display the names
        displayArea = new TextArea();
        displayArea.setEditable(false); // Users can't edit it directly

        // Set actions for the buttons
        addButton.setOnAction(e -> addName());
        showButton.setOnAction(e -> showNames());


        // Organize all UI elements vertically with vbox
        VBox layout = new VBox(10, nameInputField, addButton, showButton, displayArea);
        layout.setStyle("-fx-padding: 15; -fx-font-size: 14;");


        Scene scene = new Scene(layout, 350, 300);
        primaryStage.setTitle("Unique Names Application");
        primaryStage.setScene(scene);
        primaryStage.show(); // Show the window
    }


    // Method to add name to the HashSet
    private void addName() {
        String name = nameInputField.getText().trim();

        if (name.isEmpty()) {
            displayArea.setText("Please enter a name.");
            return;
        }

        // Attempt to add the name to the set
        if (nameSet.add(name)) {
            displayArea.setText("Name added: " + name);
        } 
        
        else {
            displayArea.setText("Duplicate name. '" + name + "' already exists.");
        }

        // Clear the input field after adding
        nameInputField.clear();
    }

    // Method to display all unique names
    private void showNames() {
        if (nameSet.isEmpty()) {
            displayArea.setText("No names added yet.");
            return;
        }

        //else statement
        StringBuilder result = new StringBuilder("Unique Names:\n");

        for (String name : nameSet) {
            result.append(name).append("\n");
        }

        displayArea.setText(result.toString());
    }


    public static void main(String[] args) {
        launch(args); 
    }
}