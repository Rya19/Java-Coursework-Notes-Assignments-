import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //arrays are reference types, need to be added dynamically
        numbers[0] = 1;
        numbers[1] = 2;
        //System.out.println(numbers); //if printing like this, we get out some weird address thing. to print the actual numbers...

        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 0, 0, 0]

        //A better way to add numbers if we know them ahead of time
        int[] numbers2 = {1, 2, 3, 5, 4};
        System.out.println(numbers2.length);
        System.out.println((Arrays.toString(numbers2)));

        Arrays.sort(numbers2);
        System.out.println((Arrays.toString(numbers2)));
    }
}