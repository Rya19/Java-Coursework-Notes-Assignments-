import java.util.Scanner;

public class arrays3ch7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 

        int[] list = {2, 6, 3, 5, 4};
        list = new int[3];// allocated new memory and remove old memory, this is okay
        int[] list2 = list; //deep copy vs. shallow copy (This is shallow copy)

        list2[100] = 100; //will make change on original (list) array, to avoid this...

        int[] list2 = new int[list.length]; //create a new array of the same size as original
        for(int i = 0; i < list.length; i++) {
            list2[i] = list[1]; //will put elements from list into list2, this is deep copy
        }

        

        }
    }
