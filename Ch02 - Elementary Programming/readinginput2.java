import java.util.Scanner;

public class readinginput2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine().trim(); //just next will not read other words seperated by a space | trim will remove white spaces
        System.out.println("You are " + name);
    }
}