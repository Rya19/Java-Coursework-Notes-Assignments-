import java.util.Scanner;
public class loopsch5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* 
        System.out.println("Enter 5 nums: ");

        int count = 0;
        int sum = 0;
        while (count < 5) {
            int x = in.nextInt(); //store user inputs into x
            sum += x;
            count++;
        }
        */

        System.out.println("Enter numbers end with 0: ");
        int x = in.nextInt(); //will take user input and store into x
        int sum = 0;
        while (x != 0) {
            sum += x;
            x = in.nextInt(); //will take user input infinietely until user inpit = 0;
        }


        for (int i = 1, j = 9; i <= 9; i++, j--) { //parameter 1 and 3 can have as many statements, parameter 2 can have 1 or none
            System.out.println(i + " " + j);
        }


    }
}