import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.PriorityQueue;

// Class representing a task with name and priority
class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    // This ensures tasks are sorted by priority becuase of the priority queue
    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task: " + name + ", Priority: " + priority;
    }
}

public class Assignment08Q02 extends Application {

    private PriorityQueue<Task> taskQueue = new PriorityQueue<>(); //queue object
    private TextArea displayArea; //text object

    @Override
    public void start(Stage primaryStage) {
        // Input fields for task name and priority
        TextField taskNameField = new TextField();
        taskNameField.setPromptText("Enter Task Name");

        TextField priorityField = new TextField();
        priorityField.setPromptText("Enter Priority (Number)");

        // Button to add task
        Button addButton = new Button("Add Task");
        addButton.setOnAction(e -> {
            String name = taskNameField.getText().trim(); //input name and text
            String priorityText = priorityField.getText().trim();

            if (!name.isEmpty() && !priorityText.isEmpty()) {
                try {
                    int priority = Integer.parseInt(priorityText); //pareseint to convert string number to number
                    taskQueue.add(new Task(name, priority));
                    
                    displayArea.appendText("Added: " + name + ", Priority: " + priority + "\n");

                    taskNameField.clear(); //to remove all elements from the next fields to keep inputting
                    priorityField.clear();
                } 
                
                catch (NumberFormatException ex) {
                    displayArea.appendText("Please enter a valid number for priority.\n");
                }
            }
        });

        // Button to show tasks sorted by priority
        Button showTasksButton = new Button("Show Tasks");
        showTasksButton.setOnAction(e -> {
            displayArea.clear();
            PriorityQueue<Task> tempQueue = new PriorityQueue<>(taskQueue);
            while (!tempQueue.isEmpty()) {
                displayArea.appendText(tempQueue.poll() + "\n");
            }
        });

        displayArea = new TextArea();
        displayArea.setEditable(false);

        VBox root = new VBox(10, taskNameField, priorityField, addButton, showTasksButton, displayArea);
        root.setStyle("-fx-padding: 10;");

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Task Scheduler");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
