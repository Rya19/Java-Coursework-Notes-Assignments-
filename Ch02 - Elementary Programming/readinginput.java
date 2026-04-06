import java.util.Scanner;

public class readinginput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: "); //print will print on the same line instead of making a new line
        byte age = scanner.nextByte(); //passing a float will result in an error, so make this float or double
        System.out.println("You are " + age); //implicit casting, java will auto matically convert byte val to a string
    }
    
}