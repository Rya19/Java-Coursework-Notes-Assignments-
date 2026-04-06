import java.io.*;
import java.util.Scanner;

public class Assignment06Q09 {
    public static void main(String[] args) {
        String filename = "numbers.dat";
        int[] numbers = new int[10];
        
        // Writing integers to file
        try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) {//randaccfile allows to read/write to a binary file
            System.out.println("Writing integers to file...");
            for (int i = 0; i < 10; i++) {
                file.writeInt(i * 10); //write random-sih numbers to a file
            }
        } 
        catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        


        // Reading integers from file
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) { //randaccfile allows to just read a binary file
            System.out.println("Reading integers from file:");
            for (int i = 0; i < 10; i++) {
                numbers[i] = file.readInt(); //reads numbers
                System.out.println("Index " + i + ": " + numbers[i]);
            }
        } 
        
        catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        
        // Modify a value at a specified index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the integer you want to modify (0-9): ");
        int index = scanner.nextInt();

        System.out.print("Enter the new value: ");
        int newValue = scanner.nextInt();
        
        try (RandomAccessFile file = new RandomAccessFile(filename, "rw")) { //create another object of a file to read/write to a file
            file.seek(index * 4L); // Move to the specific index (each int is 4 bytes), so move to that index times by 4 bytes.
            file.writeInt(newValue); //replace the value with the new value
        } 
        
        catch (IOException e) {
            System.out.println("Error modifying the file: " + e.getMessage());
        }
        
        // Display all integers after modification
        try (RandomAccessFile file = new RandomAccessFile(filename, "r")) { //another randaccfile to read from that binary file
            System.out.println("Displaying all integers from the file after modification: ");
            for (int i = 0; i < 10; i++) {
                System.out.println("Index " + i + ": " + file.readInt()); //print out numbers
            }
        } 
        
        catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
