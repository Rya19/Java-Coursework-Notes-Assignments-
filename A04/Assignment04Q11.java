import java.util.ArrayList;
import java.util.Scanner;

public class Assignment04Q11 {

    public static void main(String[] args) {
        ArrayList<Integer> list_1 = new ArrayList<>(); //make 2 new integer array objects
        ArrayList<Integer> list_2 = new ArrayList<>();

        Scanner user_in = new Scanner(System.in);

        System.out.println("Enter five integers for list 1: "); //loop for user input
        for (int i = 0; i < 5; i++) {
            int user_num = user_in.nextInt();
            list_1.add(user_num);
        }

        System.out.println("Enter five integers for list 2: ");
        for (int i = 0; i < 5; i++) {
            int user_num = user_in.nextInt();
            list_2.add(user_num);
        }

        ArrayList<Integer> result = union(list_1, list_2);
        System.out.println(result);

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> combinedList = new ArrayList<>(list1); //takes first list and stores into combinedlist
        combinedList.addAll(list2); //combines combinedlist and 2nd list

        return combinedList; //returns
    }
}

