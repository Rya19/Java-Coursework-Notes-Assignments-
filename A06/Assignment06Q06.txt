import java.io.*;

public class Assignment06Q06 {
    public static void main(String[] args) {
        // Check if correct number of arguments is provided, this for command line terminal inputs.
        if (args.length != 3) {
            System.out.println("Usage: java ReplaceWordInFile <oldWord> <newWord> <filename>");
            return;
        }

        //since each word in a sentence is an index..
        String oldWord = args[0]; //the word to find
        String newWord = args[1]; //the word to replace with
        String filename = args[2]; //filename

        File file = new File(filename);
        
        // Check if file exists
        if (!file.exists()) { //if file doesnt exist
            System.out.println("Error: The file " + filename + " does not exist.");
            return;
        }
        
        try {
            // Read file contents
            BufferedReader reader = new BufferedReader(new FileReader(file)); //create new file reader to read entire file at once
            StringBuilder fileContent = new StringBuilder();
            String line;
            
            while ((line = reader.readLine()) != null) { //while the line exists
                // Replace occurrences of oldWord with newWord
                fileContent.append(line.replace(oldWord, newWord)).append("\n"); //replace the oldword with the newword in the file
            }
            reader.close();
            
            // Write modified content back to file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file)); //create writer file to write contents to file
            writer.write(fileContent.toString());
            writer.close();
            
            System.out.println("File updated successfully.");
        } 
        
        catch (IOException e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }
}
