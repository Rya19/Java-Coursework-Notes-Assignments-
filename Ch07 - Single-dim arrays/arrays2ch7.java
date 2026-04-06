import java.util.Scanner;

public class arrays2ch7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] list = new int[size]; 
        //int[] list = {2, 4, 5, 2 ,7} Cannot initialize in 2 lines, has to be on teh same line



        for(int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 11); //cannot assign a double to an int, so cast it with an int to fix the error 
        }

        for(int x : list) { //for x numbers in list | this loop is only for reading arrays, cannot make changes in array | x (or whatever var) must be the same data type as the array
            System.out.print(x + " "); //each element in list will be assigned to X
        }
    }
}