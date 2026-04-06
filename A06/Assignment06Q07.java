import java.io.*;
import java.util.Random;

public class Assignment06Q07 {
    public static void main(String[] args) {
        String filename = "outData.dat"; //a filename as a string
        Random random = new Random(); //random obj
        
        // Append 100 random integers to the file
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream(filename, true))) { //dataoutstr used to WRITE binary data. opens the file in append mode so new data can be added
            for (int i = 0; i < 100; i++) { //in the file, write 100 random numbers that is bounded
                output.writeInt(random.nextInt(100)); // Random integer between 0-99
            }
        } 
        catch (IOException e) { //if an error happens for some reason. 
            System.out.println("Error writing to file: " + e.getMessage());
        }
        


        // Read integers from the file and compute sum and count
        int count = 0;
        int total = 0;
        try (DataInputStream input = new DataInputStream(new FileInputStream(filename))) { //datainpstr used to READ binary data, and takes a fileinputstream with the filename.
            while (true) { //while the data has numbers in it
                try {
                    total += input.readInt(); //adds the total for each number read
                    count++; //increment the count
                } 
                catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } 
        catch (IOException e) { //some error
            System.out.println("Error reading from file: " + e.getMessage());
        }
        
        // Print results
        System.out.println("Count is " + count);
        System.out.println("Total is " + total);
    }
}

