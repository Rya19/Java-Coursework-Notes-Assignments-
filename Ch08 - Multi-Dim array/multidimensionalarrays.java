import java.util.Arrays;

public class multidimensionalarrays {
    public static void main(String[] args) {
        int[][] numbers = new int[2][3]; //need to add 2 bracket sets for 2 dimen arr. 
        numbers[0][0] = 1; //set location to number
        System.out.println(Arrays.deepToString(numbers)); //deep used for multi-dimen arrays

        int[][] numbers2 = { {1, 2, 3}, {4, 5, 6} }; //way of using brackets
        System.out.println(Arrays.deepToString(numbers2));
    }
    
}