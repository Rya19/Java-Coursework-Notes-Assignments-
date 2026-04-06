import java.util.Scanner;

public class characdatatypesch4 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        char ch = 'A';
        char ch2 = 65; //ASCII value of A
        // int x = 'A'; can assign a char to an int to get ascii val
        char ch3 = '\u0041';

        String str = new String("apple"); //create reference variable in call stack | create reference in heap
        System.out.println(str.toUpperCase());
        System.out.println(str); //changes not made to original

        System.out.println(str.charAt(1)); //p


        //---------------------------------------------------------------------------------------------------------------------------



        Scanner input = new Scanner(System.in);
        int x = input.nextInt(); //nextint will not read the next codes after this line
        input.nextLine(); //need this line so nextint will ignore the \n and will not ignore future user inputs
        str = input.nextLine(); //next will just read the first word, so use nextline to read all of the users input
        System.out.println(x);
        System.out.println(str);
        input.close();
    }
}