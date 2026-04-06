import java.io.*;

public class Ch12exceptprac {
    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();  // Ensure proper line formatting
            }
            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file '" + sourceFile + "' not found.");
        } catch (IOException e) {
            System.out.println("Error: Problem occurred while reading/writing the file.");
        }
    }
}

