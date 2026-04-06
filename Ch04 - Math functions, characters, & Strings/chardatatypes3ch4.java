import java.util.Scanner;
public class chardatatypes3ch4 {

    public static void main(String[] args) {
        double price = 34;
        String s = "A";

        for (int i = 2; i <= 10; i+=2) { //i = 0; i < 5; i++ basically is whats happening
            double j = Math.sqrt(i); //v use d for ints
            System.out.printf("%5s %5d %10.2f\n", s + i, i, j); //%-5s applied to s + i, %-5d is applied to i, %-10.2f is applied to j | - will push stuff to left 
        }
    }
}