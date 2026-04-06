import java.util.Scanner;
import java.util.regex.*;

public class Assignment01Q8 {

    public static void main(String[] args) {
        Scanner User_in = new Scanner(System.in); //to read user input
        System.out.println("Enter a valid SSN: ");
        String SS_User = User_in.nextLine(); //put user input in variable

        System.out.println(Valid_SSN(SS_User)); //printing function
        User_in.close();// to remove warning

        //boolean b = Valid_SSN(SS_User);


    }

    static boolean Valid_SSN(String User_String) {
        String regex = "^(?!666|000|9\\d{2})\\d{3}-(?!00)\\d{2}-(?!0{4})\\d{4}$";
        // ^ represents start of string
        // $ represents end of string
        // (?!666|000|9\\d{2})\\d{3} represents the first 3 digits should not start with 000, 666, or between 900 and 999
        // - rperesents string follwoed by -
        // (?!00)\\d{2} represents the next 2 digits should not start with 00 and it should be any from 01-99.
        // (?!0{4})\\d{4} represents the next 4 digits can’t 0000 and it should be any from 0001-9999.

        return Pattern.matches(regex, User_String) ? true : false; //simplify if-statement

    

    }
}