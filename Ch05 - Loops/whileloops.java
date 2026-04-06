import java.util.Scanner;

public class whileloops {

    public static void main(String[] args) {
        /* 
        int i = 5;
        while (i > 0) {
            System.out.println("hi");
            i--;
        }
        */

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase(); //dont put scanner intialization in while loop
            System.out.println(input);
        }
    }
}