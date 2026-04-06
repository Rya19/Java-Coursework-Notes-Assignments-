public class ch12except2 {

    public static void main(String[] args) {

        try {
            int[] list = {1, 2, 3};
            System.out.println(list[4]);
        }
        catch(ArrayIndexOutOfBoundsException obj) {
            System.out.println(obj);
        }

        System.out.println("End of main method");

    }
}