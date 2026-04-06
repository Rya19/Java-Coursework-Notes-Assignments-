import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class Assignment06Q05 {
    public static void main(String[] args) {
        // Array to store frequency (indexes 1-5 correspond to ratings)
        int[] frequency = new int[6]; // Index 0 is unused

        // Read numbers from numbers.txt
        try (Scanner scanner = new Scanner(new File("numbers.txt"))) { //create a scanner to read from a file object
            while (scanner.hasNextInt()) { //while the file has stuff to read
                int rating = scanner.nextInt(); //reads each number
                if (rating >= 1 && rating <= 5) {
                    frequency[rating]++; // Increment count at the corresponding index, keep going until nothing is left to read
                }
            }
        } 
        catch (FileNotFoundException e) { //file not found
            System.out.println("Error: numbers.txt not found.");
            return;
        } 
        catch (NoSuchElementException e) { //wrong file type
            System.out.println("Error reading file.");
            return;
        }

        // Write results to output.txt
        try (PrintWriter writer = new PrintWriter("output.txt")) { //object to write to file
            writer.println("Rating\tFrequency");
            for (int i = 1; i <= 5; i++) {
                writer.printf("%d\t\t%d%n", i, frequency[i]);
            }
        } 
        catch (FileNotFoundException e) { //for some reason if file coundlt be created
            System.out.println("Error creating output.txt.");
        }

        
        System.out.println("Rating\tFrequency"); //to print to console
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d\t\t%d%n", i, frequency[i]);
        }
    }
}

