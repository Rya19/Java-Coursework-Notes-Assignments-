import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Collections;
import java.util.LinkedList;

public class Assignment08Q05 extends Application {

    // LinkedList to store the shopping items
    private final LinkedList<String> shoppingList = new LinkedList<>();

    // text fields
    private TextField itemInputField;
    private TextArea listDisplayArea;


    @Override
    public void start(Stage primaryStage) {

        // text Input field to type an item name
        itemInputField = new TextField();
        itemInputField.setPromptText("Enter an item");

        //  buttons for each action
        Button addButton = new Button("Add Item");
        Button sortButton = new Button("Sort Items");
        Button removeButton = new Button("Remove Item");
        Button showButton = new Button("Show List");


        // TextArea to show the current list
        listDisplayArea = new TextArea();
        listDisplayArea.setEditable(false); // Disable manual editing


        // buttons with actions
        addButton.setOnAction(e -> addItem());
        sortButton.setOnAction(e -> sortItems());
        removeButton.setOnAction(e -> removeItem());
        showButton.setOnAction(e -> showList());

        // Layout
        VBox layout = new VBox(10,
                itemInputField,
                addButton,
                sortButton,
                removeButton,
                showButton,
                listDisplayArea
        );
        layout.setStyle("-fx-padding: 15; -fx-font-size: 14;");

        // Scene setup
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setTitle("Shopping List Application");
        primaryStage.setScene(scene);
        primaryStage.show(); // Display the window
    }

    // Add item to the shopping list
    private void addItem() {
        String item = itemInputField.getText().trim();

        if (item.isEmpty()) {
            listDisplayArea.setText("Please enter an item name.");
            return;
        }

        shoppingList.add(item);
        listDisplayArea.setText("Added: " + item);

        // Clear input field after adding
        itemInputField.clear();
    }

    // Sort the shopping list alphabetically
    private void sortItems() {
        if (shoppingList.isEmpty()) {
            listDisplayArea.setText("The list is empty. Nothing to sort.");
            return;
        }

        Collections.sort(shoppingList); // Sort alphabetically
        listDisplayArea.setText("List sorted.");
    }

    // Remove item from the list
    private void removeItem() {
        String itemToRemove = itemInputField.getText().trim();

        if (itemToRemove.isEmpty()) {
            listDisplayArea.setText("Please enter an item to remove.");
            return;
        }

        if (shoppingList.remove(itemToRemove)) {
            listDisplayArea.setText("Removed: " + itemToRemove);
        } 
        
        else {
            listDisplayArea.setText("Item not found: " + itemToRemove);
        }

        // Clear input field after removing
        itemInputField.clear();
    }

    // Display the current shopping list
    private void showList() {
        if (shoppingList.isEmpty()) {
            listDisplayArea.setText("The shopping list is empty.");
            return;
        }

        StringBuilder result = new StringBuilder("Current List:\n");
        for (String item : shoppingList) {
            result.append(item).append("\n");
        }

        listDisplayArea.setText(result.toString());
    }


    public static void main(String[] args) {
        launch(args);
    }
}