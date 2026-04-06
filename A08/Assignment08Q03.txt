import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashMap;

public class Assignment08Q03 extends Application {
    //PRIVATE
    // This HashMap stores course names as keys and the number of students as values
    private final HashMap<String, Integer> courseMap = new HashMap<>();

    // UI Component text fields
    private TextField courseNameField;
    private TextField studentCountField;
    private TextArea OutPutText;

    //PUBLIC
    @Override
    public void start(Stage primaryStage) {

        // text fields for course name and number of students
        courseNameField = new TextField();
        courseNameField.setPromptText("Enter course name");

        studentCountField = new TextField();
        studentCountField.setPromptText("Enter number of students");

        //  buttons
        Button registerButton = new Button("Register Course");
        Button showButton = new Button("Show Course Registrations");

        //  text area to display the courses
        OutPutText = new TextArea();
        OutPutText.setEditable(false); // User shouldn't type here directly

        //button actions
        registerButton.setOnAction(e -> registerCourse());
        showButton.setOnAction(e -> showCourses());

        // Arrange everything vertically
        VBox layout = new VBox(10, courseNameField, studentCountField, registerButton, showButton, OutPutText);
        layout.setStyle("-fx-padding: 15; -fx-font-size: 14;");

        //  set up the scene
        Scene scene = new Scene(layout, 400, 350);
        primaryStage.setTitle("Course Registration Application");
        primaryStage.setScene(scene);
        primaryStage.show(); 
    }

    // Functions to handle course registration
    private void registerCourse() {
        String courseName = courseNameField.getText().trim();
        String studentCountText = studentCountField.getText().trim();

        // Input validation
        if (courseName.isEmpty() || studentCountText.isEmpty()) {
            OutPutText.setText("Please enter both course name and number of students.");
            return;
        }

        try {
            int studentCount = Integer.parseInt(studentCountText); // Convert string to int
            courseMap.put(courseName, studentCount); // Save the course and student count
            OutPutText.setText("Course registered: " + courseName + " with " + studentCount + " students.");
            
            // Clear input fields to input again later
            courseNameField.clear();
            studentCountField.clear();
        } 
        
        catch (NumberFormatException e) {
            OutPutText.setText("Please enter a valid number for students.");
        }
    }

    // Function to display all registered courses
    private void showCourses() {
        if (courseMap.isEmpty()) {
            OutPutText.setText("No courses registered yet.");
            return;
        }

        StringBuilder displayText = new StringBuilder("Registered Courses:\n");
        for (String course : courseMap.keySet()) {
            displayText.append(course).append(": ").append(courseMap.get(course)).append(" students\n");
        }

        OutPutText.setText(displayText.toString());
    }

    public static void main(String[] args) {
        launch(args); 
    }
}