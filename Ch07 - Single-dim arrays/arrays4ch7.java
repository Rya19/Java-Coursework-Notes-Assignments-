import java.util.Arrays;

public class arrays4ch7 {

    public static void main(String[] args) {
        int[] list = {1, 4, 5};
        int[] list2 = new int[list.length];

        System.arraycopy(list, 0, list2, 0, list.length); //sourcearray, source position, target array, target position, length (to copy all elements)

        System.out.println(Arrays.toString(list2)); //Arrays is a utility to print elements of a array
        
    }
}