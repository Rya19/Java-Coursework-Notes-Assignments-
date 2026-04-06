import java.util.Scanner;

public class breakandcontinue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) { //will always run until user inputs "quit" as shown in the bottom
            System.out.print("Input: ");
            input = scanner.next().toLowerCase(); //dont put scanner intialization in while loop

            if (input.equals("pass")) {
                continue; //when java sees this, it will move its control back to the beginning of the loop
            }

            if (input.equals("quit")) { //if user types quit, will clode program and wont echo back "quit"
                break; 
            }
            
            System.out.println(input);

        }
    }
}