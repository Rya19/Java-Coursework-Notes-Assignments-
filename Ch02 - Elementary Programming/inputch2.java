//All import statements must be at the beginning of the program
import java.lang.System; //only package thats avaaible to the program by default
import java.io.PrintStream; //packages used to print out stuff, default by program
import java.util.Scanner; //for reading inputs

//import java.util.* will load all classes that belong to the util

public class inputch2 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in); //object of a class scanner | initiate the variable | constructs object of scanner in heap area, and returns memory address into user_input variable | System.in represents keyboard
        System.out.println("Enter number: ");
        double x = user_input.nextDouble(); //if a person inputs a double/float into a int, youll get a runtime error, so variable to store input needs to be same type
        System.out.println(x); //out is to print from console




    }
}