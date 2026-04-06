import java.util.Scanner;

public class selectionch3 {

    public static void main(String[] args) {
        boolean b = true; //cannot convert bool to int and vice versa;

        Scanner in = new Scanner(System.in);
        int x = in.nextInt(); //x takes in the "in" varaible's user input

        if (1 <= x && x <= 10) {
            System.out.println("yes");
        }
    }
}