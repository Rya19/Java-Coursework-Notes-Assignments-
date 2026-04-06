import java.util.Scanner;

public class Assignment01Q7 {

    public static void main(String[] args) {
        System.out.println("Enter a string of characters: ");
        Scanner user_in = new Scanner(System.in); //new scanner input to read user input 
        String User_input = user_in.nextLine(); //assigning user input to variable

        Vowel_Counter(User_input); //putting user input into function
        user_in.close(); // to remove warning
    }

    static void Vowel_Counter(String user_string) {
        user_string.toLowerCase(); //putting user string to all lowercase
        char[] user_vowel_array = new char[user_string.length()]; //creating new array the size of user string
        user_vowel_array = user_string.toCharArray(); //putting user string into array

        int A_vowel = 0; //Counters
        int E_vowel = 0;
        int I_vowel = 0;
        int O_vowel = 0;
        int U_vowel = 0;
        int Non_Vowels = 0;

        for (int i = 0; i < user_string.length(); i++) { //forloop to loop through all characters
            if (user_vowel_array[i] == 'a') {
                A_vowel++;
            }
            else if (user_vowel_array[i] == 'e') {
                E_vowel++;
            }
            else if (user_vowel_array[i] == 'i') {
                I_vowel++;
            }
            else if (user_vowel_array[i] == 'o') {
                O_vowel++;
            }
            else if (user_vowel_array[i] == 'u') {
                U_vowel++;
            }
            else {
                Non_Vowels++;
            }
        }

        System.out.println("Number of each lowercase vowel in the string: "); //to print
        System.out.println("a: " + A_vowel + "\n" + "e: " + E_vowel + "\n" + "i: " + I_vowel + "\n" + "o: " + O_vowel + "\n" + "U: " + U_vowel + "\n" + "Other characters: " + Non_Vowels + "\n");
    }
}