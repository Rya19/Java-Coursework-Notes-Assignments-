import java.io.*;
import java.util.Scanner;

public class Lab05 {

    public static void main(String[] args) {
        java.io.File Linc_File = new java.io.File("Lincoln.txt"); //Input file
        java.io.File letterCount = new java.io.File("letterCount.txt"); //Output file

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String word_count;
        char letters_array[] = chars.toCharArray();
        int frequency[] = new int[26];
        
            if (letterCount.exists()) { //If the output file already exists
                System.out.println("File already exists");
                System.exit(0);
            }

            else {
                try(Scanner input = new Scanner(Linc_File)) { // to read the lincoln file
                    java.io.PrintWriter output = new java.io.PrintWriter(letterCount);
                    String line;

                    while ((line = input.nextLine()) != null) {
                        for (char letter : line.toCharArray()) {
                            if (Character.isLetter(letter)) {
                                letter = Character.toUpperCase(letter);
                                frequency[letter - 'A']++;
                            }
                        }

                        
                    }
                }
                catch (FileNotFoundException e) {
                    System.out.println("Error: Input file not found.");
                } 
            }
        
    }
}